package xpath;

import util.TestUtils;

public class GooglesearchTest extends TestUtils {

    public static void main(String[] args) throws Throwable {

        TestUtils.getDriver("https://www.google.com/");


        Thread.sleep(5000);
        driver.quit();


    }

}
