package APIAutomation.utilities;

import org.apache.commons.lang.RandomStringUtils;

public class RestUtils {

    public static String empName(){
       String generatedString= RandomStringUtils.randomAlphabetic(1);
       return ("API"+generatedString);
    }
    public static String empSal(){
        String generatedString=RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }

    public static String empAge(){
        String generatedString=RandomStringUtils.randomNumeric(2);
        return (generatedString);
    }

    public static String getFirstName(){
        String generatedString= RandomStringUtils.randomAlphabetic(1);
        return ("API"+generatedString);
    }

    public static String getEmail(){
        String generatedString= RandomStringUtils.randomAlphabetic(3);
        return (generatedString+"gamil.com");
    }
}
