package ExcelAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataDriveTest {
    public WebDriver driver;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    @Test(dataProvider = "login",alwaysRun = true)
    void test(String user,String pwd,String exp){
        driver.get("https://admin-demo.nopcommerce.com/login");
        WebElement textEmail=driver.findElement(By.id("Email"));
        textEmail.clear();
        textEmail.sendKeys(user);

        WebElement textPassword=driver.findElement(By.id("Password"));
        textPassword.clear();
        textPassword.sendKeys(pwd);
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        String exp_title="Dashboard / nopCommerce administration";
        String act_title=driver.getTitle();

        if(exp.equals("Valid")) {
            if (exp_title.equals(act_title)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }else if(exp.equals("Invalid")){
            if (exp_title.equals(act_title)){
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            }else {
                Assert.assertTrue(true);
            }

        }
    }

    @DataProvider(name="login")
    public Object[][] getData() throws Exception {
        //String path=".\\DataFiles\\loginData.xlsx";
        String path="C:\\Users\\marala\\git3\\seleniumautomation\\Mavenproject\\test\\selenium\\SeleniumJava\\DataFiles\\loginData.xlsx";
        XLUtility xl=new XLUtility(path);
        int rows= xl.getRowCount("Sheet1");
        int cols= xl.getCellCount("Sheet1",1);
       //String loginData[][]=new String[rows][cols];
        Object loginData[][]=new Object[rows][cols];
       for (int i=1;i<rows;i++){
           for (int j=0;j<cols;j++){
               loginData[i-1][j]=xl.getCellData("Sheet1",i,j);
           }
       }

       return loginData;
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

    Object[][] getData1(){
        Object[][]data={{"hell0","text",1},{"bye","message",143},{"solo","call",453}};
        Object[][]data1=new Object[2][3];
            data1[0][0]="hello";
            data1[0][1]="text";
            data1[0][2]=1;
            data1[1][0]="bye";
            data1[1][1]="message";
            data1[1][2]=143;
            data1[2][0]="solo";
            return data;

    }
}
