package WebTables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import util.TestUtils;

public class Dropdown extends TestUtils {

    public static void main(String[] args) throws Throwable {

//
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");
//		driver.manage().window().maximize();

        TestUtils.getDriver("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");

        String[] exp = {"Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        WebElement dropdown = driver.findElement(By.id("date_mon"));
        Select select = new Select(dropdown);
        List<WebElement> list = driver.findElements(By.tagName("option"));
        System.out.println(list.size());
        for (WebElement drop : list) {
            System.out.println(drop.getText());
            if (drop.getText().equalsIgnoreCase("12")) {
                drop.click();

            }
            if (drop.getText().equalsIgnoreCase("DEC")) {
                drop.click();

            }

            if (drop.getText().equalsIgnoreCase("2010")) {
                drop.click();
            }
            if (drop.getText().equalsIgnoreCase("india")) {
                drop.click();
            }
            if (drop.getText().equalsIgnoreCase("Bengaluru")) {
                drop.click();
            }

        }
        //with out select tag
        System.out.println("without select tag");
        List<WebElement> options1 = driver.findElements(By.xpath("//*[@id='date_yr']//option"));
        for (WebElement option : options1) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("1917")) {
                option.click();
                break;
            }


        }


        System.out.println("without select tag end");
        //count of dropdown
        List<WebElement> countDropdown = driver.findElements(By.tagName("select"));
        System.out.println("countDropdown :" + countDropdown.size());

        System.out.println(select.getAllSelectedOptions());
        if (select.isMultiple()) {
            System.out.println("multiple");
        } else {
            System.out.println("is not multiple");
        }
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();

        for (WebElement w : options) {

            if (w.getText().equals("MAY")) {
                w.click();
                break;
            }
        }

        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).getText().equals("JUN")) {
                options.get(i).click();
                break;
            }
        }
        for (WebElement we : options) {
            for (int i = 0; i < exp.length; i++) {
                if (we.getText().equals(exp[i])) {
                    System.out.println("Matched");
                    i = exp.length;

                }
            }
            //radio buttons
            WebElement radio = driver.findElement(By.id("sex"));
            if (radio.isSelected()) {
                System.out.println("selected");
            } else {
                System.out.println("not selected");
            }
        }

        List<WebElement> radiobtns = driver.findElements(By.xpath("//*[@type='radio']"));

        System.out.println(radiobtns.size());

        for (WebElement r : radiobtns) {
            String val = r.getAttribute("value");

            if (r.getAttribute("value").equalsIgnoreCase("f")) {
                r.click();
            }
            if (val.equalsIgnoreCase("m")) {
                r.click();
            }
        }

        for (int i = 0; i < radiobtns.size(); i++) {
            String values = radiobtns.get(i).getAttribute("value");
            if (values.equals("f")) {
                radiobtns.get(i).click();
                break;
            }
        }


        Select s = new Select(driver.findElement(By.name("country")));

        List<WebElement> option = s.getOptions();
        for (WebElement c : option) {
            if (c.getText().equalsIgnoreCase("malaysia")) {
                c.click();
                break;
            }
        }

        List actualList = new ArrayList();

        for (WebElement order : option) {
            String data = order.getText();
            actualList.add(data);
        }
        List temp = new ArrayList();
        temp.addAll(actualList);

        Collections.sort(temp);
        System.out.println(temp);
        System.out.println(actualList);
        if (temp == actualList) {

        }
        Thread.sleep(3000);
        driver.close();

    }

}
