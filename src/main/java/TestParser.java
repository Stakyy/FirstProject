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

public class TestParser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        ChromeOptions chrome_options =new ChromeOptions();
        chrome_options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities chromeCaps = DesiredCapabilities.chrome();
        chromeCaps.setCapability(ChromeOptions.CAPABILITY, chrome_options);
        WebDriver driver = new ChromeDriver(chromeCaps);

        driver.navigate().to("https://kazan.vseinstrumenti.ru/electrika-i-svet/cords-splitters/na-ramke/");
        WebElement element = null;
        ArrayList<Item> list = new ArrayList<>();

       Thread.sleep(10000);
       driver.findElement(By.cssSelector("css=div > .paging > .arrowScrollRightRed")).click();





       // System.out.println(element.isEnabled());
//        List<String> prices = new ArrayList<>();
//        StringBuilder a = new StringBuilder();
//        Document document = Jsoup.parse(a.toString(), "UTF-8");
//        Elements links = document.select("alt");
//        for (Element elemen: links){
//            prices.add(elemen.attr("alt").toString());
//        }
//        a.append(driver.getPageSource());
//        System.out.println(a.toString());
//        System.out.println(prices);
//        while (true) {
//                try {
////                    if(!driver.findElement(By.className("showMore")).isEnabled()){
////                        break;
////                    }
//
//                   driver.findElement(By.tagName("arrowScrollRightRed")).click();
//
//
//
//
//                    System.out.println("Нажалось");
//                    Thread.sleep(3000);
//                } catch (Exception e){
//                    e.printStackTrace();
//                    break;
//                }
//
//
//
//
//        }
        //String type = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div[3]/div[1]/section/div[2]/h1")).getText();

        List<WebElement> codes = new ArrayList<>();//driver.findElements(By.className("code")));
        List<WebElement> names = new ArrayList<>();//driver.findElements(By.className("product-name")));
       List<WebElement> prices = new ArrayList<>();//driver.findElements(By.className("amount")? driver.findElements(By.className("amount"): 0.00));
        List<Double> pr = new ArrayList<>();
        for (WebElement element1 : driver.findElements(By.className("price-actual"))){
            if (!element1.getText().equals("")){
                System.out.println(element1.getText());
                String s = element1.getText().replaceAll("\\W",  "");

                pr.add(Double.parseDouble(s));
            }
            else pr.add(0.0);
        }
        System.out.println(pr.size());
       for (Double s : pr){
           System.out.println(s);
       }
      // driver.close();
//
//        for (int i = 0; i < codes.size(); i++) {
//            list.add(new Item(type,
//                    Integer.parseInt(codes.get(i).getText().replaceAll("\\W+", "")),
//                    names.get(i).getText(),
//                    Double.parseDouble(prices.get(i).getText().replace(" ", ""))));
//        }
//        for (Item item: list){
//            System.out.println(item);
//        }
    }
}

//#page-wrapper > div > div.wrap > div:nth-child(3) > div.content-block-ignore > section > div.content > div:nth-child(7) > table > tbody > tr > td:nth-child(3) > div > div > div > a.sprArrow.arrowScrollRightRed