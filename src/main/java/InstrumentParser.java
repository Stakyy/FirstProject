import Items.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class InstrumentParser extends Thread {
    private String url;
    private ArrayList<Item> list = new ArrayList<>();

    public  ArrayList<Item> getList() {
        return list;
    }

    public InstrumentParser(String url) {
        this.url = url;
    }

    public  void search(String URL) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stakyy\\Desktop\\chromedriver.exe");
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        ChromeOptions chrome_options =new ChromeOptions();
        chrome_options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities chromeCaps = DesiredCapabilities.chrome();
        chromeCaps.setCapability(ChromeOptions.CAPABILITY, chrome_options);
        WebDriver driver = new ChromeDriver(chromeCaps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(URL);
        while(true){
            try{
                driver.findElement(By.className("showMore")).click();
            } catch (Exception e){
                break;
            }
        }
        String type = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div[3]/div[1]/section/div[2]/h1")).getText();
        List<WebElement> codes = new ArrayList<>(driver.findElements(By.className("code")));
        List<WebElement> names = new ArrayList<>(driver.findElements(By.className("product-name")));
        List<WebElement> prices = new ArrayList<>(driver.findElements(By.className("price-actual")));



            for (int i = 0; i < codes.size(); i++) {
               list.add(new Item(type,
                       Integer.parseInt(codes.get(i).getText().replaceAll("\\W+", "")),
                       names.get(i).getText(),
                       Double.parseDouble(prices.get(i).getText().replace(" ", ""))));
            }

        driver.close();

    }


    @Override
    public void run() {
      search(url);
   }


}
