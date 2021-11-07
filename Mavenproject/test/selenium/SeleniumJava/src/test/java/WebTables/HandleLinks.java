package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandleLinks {

    @Test(enabled = false)
    void validateLinks()throws Throwable{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        //driver.findElement(By.linkText("Amazon Pay")).click();

        //How to capture all the links
        List<WebElement> links=driver.findElements(By.tagName("a"));

        for (WebElement link:links){
            System.out.println(link.getText()+":"+link.getAttribute("href"));
        }
        Thread.sleep(2000);

    }

    @Test(enabled = false)
    void handleBrokenLinks(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement>links=driver.findElements(By.tagName("a"));
        for (WebElement element:links){
            String url=element.getAttribute("href");
            if(url==null || url.isEmpty()){
                System.out.println("URL is empty");
                continue;
            }else {
                try {
                    URL link=new URL(url);
                    HttpURLConnection httpconnect=(HttpURLConnection )link.openConnection();
                    httpconnect.connect();
                    if(httpconnect.getResponseCode()>=400){
                        System.out.println(httpconnect.getResponseCode()+" is "+"Broken link");
                    }else {
                        System.out.println(httpconnect.getResponseCode()+" is "+"valid link");
                    }
                }catch (Exception e){

                }
            }
        }



    }

    @Test
    void validateBrokenLinks(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

       // List<WebElement>links=driver.findElements(By.tagName("a"));
        List<String>arrList=new ArrayList<String>();
//        for (WebElement e:links){
//            String link= e.getAttribute("href");
//            //brokenLinksCheck(link);
//            arrList.add(link);
//        }
       // driver.findElements(By.tagName("a")).stream().forEach(e->arrList.add(e.getAttribute("href")));
        List<String> ls=driver.findElements(By.tagName("a")).stream().map(e->e.getAttribute("href")).collect(Collectors.toList());
        long stTime=System.currentTimeMillis();
       // arrList.parallelStream().forEach(e->brokenLinksCheck(e));
       // arrList.stream().forEach(e->brokenLinksCheck(e));
        //ls.stream().forEach(e->brokenLinksCheck(e));
      //  ls.parallelStream().forEach(e->brokenLinksCheck(e));
        ls.stream().parallel().forEach(e->brokenLinksCheck(e));
        long endTime=System.currentTimeMillis();
        System.out.println("total time taken:"+(endTime-stTime));
        driver.quit();
    }

    void brokenLinksCheck(String url)  {
        try{
            URL links=new URL(url);
            HttpURLConnection httpConnect=(HttpURLConnection)links.openConnection();
            httpConnect.setConnectTimeout(4000);
            httpConnect.connect();
            if(httpConnect.getResponseCode()>=400){
                System.out.println(httpConnect.getResponseCode()+" is "+"Broken link");
            }else {
                System.out.println(httpConnect.getResponseCode()+" is "+"Valid link");
            }

        }catch (Exception e){

        }
    }
}
