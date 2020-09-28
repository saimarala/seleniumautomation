package Java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import util.SeleniumBase;

public class WindowHandlerStream extends SeleniumBase {
    @Test
    void winhandletest() throws Throwable {
        getDriver("http://www.popuptest.com/goodpopups.html","chrome");
        driver.findElement(By.linkText("Good PopUp #3")).click();

//        String title = switchToWindowTest(driver, "PopupTest Thursday");
//        System.out.println(title);

    }
//    public static String switchToWindowTest(WebDriver driver, String title){
//
//        return	driver.getWindowHandles()
//                .stream()
//                .map(handler -> driver.switchTo().window(handler).getTitle())
//                .filter(ele -> ele.contains(title))
//                .findFirst()
//                .orElseThrow(() -> {
//                    throw new RuntimeException("No Such window");
//                });


  //  }
}
