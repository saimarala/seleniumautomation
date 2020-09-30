package Java8;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.util.ArrayList;
import java.util.List;

public class LinksWithStream extends SeleniumBase {

    @Test
    void testFooter() throws Throwable {

        getDriver("https://www.freshworks.com/","chrome");
        //List<WebElement> footerList = driver.findElements(By.cssSelector("ul.footer-nav li"));

        List<String> newFooterList = new ArrayList<String>();
        driver.findElements(By.cssSelector("ul.footer-nav li"))
                .stream()
                .forEach(ele -> newFooterList.add(ele.getText()));

//		footerList.stream().forEach(ele -> newFooterList.add(ele.getText()));

        newFooterList.forEach(System.out::println);
    }

}
