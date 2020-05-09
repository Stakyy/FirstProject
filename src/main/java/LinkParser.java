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

public class LinkParser {
    private static List<String> urls = new ArrayList<>();
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
//            Pattern pattern = Pattern.compile("((/tovary-pervoj-neobhodimosti/)|" +
//                    "(/instrument/)|" +
//                    "(/ruchnoy_instrument/)|" +
//                    "(/sadovaya_tehnika/)|" +
//                    "(/silovaya_tehnika/)|" +
//                    "(/stanki/)|" +
//                    "(/avtogarazhnoe_oborudovanie/)|" +
//                    "(/santehnika/)|" +
//                    "(/krepezh/)|" +
//                    "(/rashodnie_materialy/)|" +
//                    "(/electrika_i_svet/)|" +
//                    "(/klimat/)|" +
//                    "(/otdyh-i-sport/)|" +
//                    "(/stroitelnaya_tehnika_i_oborudovanie/)|" +
//                    "(/uborka/)|" +
//                    "(/spetsodezhda/)|" +
//                    "(/bezopasnost/))+\\w");
//           for (int i =0; i<urls.size(); i++){
//               Matcher matcher = pattern.matcher(urls.get(i));
//               if (matcher.find()){
//                   urls2.add(urls.get(i));
//               }
//          }

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
//            File urlBefore = new File("UrlBefore.txt");
//            File urlAfter = new File("UrlAfter.txt");
//            FileWriter writerBefore = new FileWriter(urlBefore);
//            FileWriter writerAfter = new FileWriter(urlAfter);
            urls.clear();
            urls.addAll(urls2);

//            for (String s: urls){
//                writerBefore.write(s);
//                writerBefore.write("\n");
//            }
//            writerBefore.close();


//            for (int i = 0; i<urls.size(); i++) {
//                    if ((i + 1) < urls.size() && urls.get(i + 1).contains(urls.get(i))) {
//                        urls.remove(urls.get(i));
//                    }
//            }

        }
//            for (int i = 0; i<urls.size(); i++) {
//
//                if ((i + 1) < urls.size() && urls.get(i + 1).contains(urls.get(i))) {
//                    urls.remove(urls.get(i));
//                }
//
//            }
//public static void main(String[] args) {
//    for (String s: urls){
//        System.out.println(s);
//    }
//}

//            writerAfter.close();


}
