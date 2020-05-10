import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/*
Парсинг всех главных ссылок с сайта
 */

public class LinkParser {
    private static List<String> urls = new ArrayList<>(); //Список полученных ссылок
    public List<String> getUrls() {
        return urls;
    }
    private static Set<String> urls2 = new TreeSet<>();
    public static void parseLinks() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stakyy\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://vseinstrumenti.ru/map.html");
        try {
            StringBuilder a = new StringBuilder();
            a.append(driver.getPageSource());
            Document document = Jsoup.parse(a.toString(), "UTF-8");
            Elements links = document.select("a");
            for (Element element: links){
                urls.add(element.attr("href").toString());
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        driver.close();

    }
        static {
            try {
                parseLinks();
            } catch (Exception e) {
                e.printStackTrace();
            }
            urls2.addAll(urls);

            urls.clear();
            urls.addAll(urls2);
        }

}
