package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable {
        @Test(enabled = false)
    void validateWetables() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_current_Indian_chief_ministers");


        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();


        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
        //columns
        //////////////////////////////
        int colHeader = 0;
        int rowHeader = 0;
        String CBeforeXpath = "//*[@id='mw-content-text']/div[1]/table[2]/thead/tr/th[";
        String CAfterXpath = "]";
        //int ColCount=0;
        List<WebElement> col = driver.findElements(By.xpath("//*[@id='mw-content-text']/div[1]/table[2]/thead/tr/th"));
        System.out.println("colSize :" + col.size());
        for (int j = 1; j <= col.size(); j++) {
            String CActualXpath = CBeforeXpath + j + CAfterXpath;
            WebElement elemenHeader = driver.findElement(By.xpath(CActualXpath));
            if (elemenHeader.getText().equalsIgnoreCase("Name")) {
                colHeader = j;

            } else if (elemenHeader.getText().contains("(past chief ministers)")) {
                rowHeader = j;

            }


        }


        //rows
        List<WebElement> row = driver.findElements(By.xpath("//*[@id='mw-content-text']/div[1]/table[2]/tbody/tr"));
        String BeforeXpath = "//*[@id='mw-content-text']/div[1]/table[2]/tbody/tr[";
        String AfterXpath = "]//td[" + rowHeader + "]";
        System.out.println("rowSize :" + row.size());
        int rowNum = 0;
        for (int i = 1; i <= row.size(); i++) {
            String ActualXpath = BeforeXpath + i + AfterXpath;
            WebElement element = driver.findElement(By.xpath(ActualXpath));
            if (element.getText().contains("Assam")) {
                rowNum = i;
                break;

            }
        }

        WebElement e = driver.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/table[2]/tbody/tr[" + rowNum + "]//td[" + colHeader + "]//a"));
        System.out.println(e.getText());


        Thread.sleep(5000);
        driver.close();

    }

    @Test(enabled = false)
    void staticWebTable(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
            driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
            driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
            driver.findElement(By.xpath("//li[@id='menu-dashboard']//a[contains(text(),'Dashboard')]")).click();
            int cCount=driver.findElements(By.xpath("//*[@id='content']//table/thead/tr//td")).size();
            int rcount=driver.findElements(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr")).size();
            //retrieve all data from table
//            for (int i=1;i<=rcount;i++){
//                for (int j=1;j<=cCount;j++){
//                    String text=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//                    System.out.print(text+" ");
//                }
//                System.out.println();
//            }
        for (int i=1;i<=rcount;i++){
            String orderID=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]")).getText();
            if (orderID.equalsIgnoreCase(Integer.toString(13882))){
                String customer=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText();
                String status=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
                String Added=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
                String Total=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[5]")).getText();
                System.out.println(customer+" "+status+" "+Added+" "+Total);
                break;
            }
        }
        driver.quit();
         }

         @Test
        void dynamicWebtable() throws InterruptedException {
             WebDriverManager.chromedriver().setup();
             WebDriver driver=new ChromeDriver();
             driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
             driver.findElement(By.xpath("//input[@id='input-username']")).clear();
             driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
             driver.findElement(By.xpath("//input[@id='input-password']")).clear();
             driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
             driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
             driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
             driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
             String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();

             int totalPages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
             System.out.println(totalPages);
             for (int p=1;p<=totalPages;p++){
                 WebElement active_page=driver.findElement(By.xpath("//*[@class='pagination']//li//span"));
                 System.out.println("Active page:"+active_page.getText());
                 active_page.click();
                 int rowNum=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

                for (int i=1;i<=rowNum;i++){
                    String ordrID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
                    String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
                    String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[4]")).getText();
                    //System.out.println(ordrID+" "+customerName+" "+status);
                    if(status.equals("Pending")){
                        System.out.println(ordrID+" "+customerName+" "+status);
                    }
                }
                 String pageNo=Integer.toString(p+1);
                 driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()="+pageNo+"]")).click();
             }
             Thread.sleep(3000);
             driver.quit();

        }
}
