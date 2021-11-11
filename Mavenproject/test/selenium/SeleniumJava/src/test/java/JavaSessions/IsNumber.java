package JavaSessions;

import org.testng.annotations.Test;

public class IsNumber {

    @Test
    void isNumber(){
        isValidPhoneNumber("1234567891");
    }

    static boolean isNumber(String number){

        try {
            Long.parseLong(number);
            System.out.println("this is a valid number"+number);
        }catch (Exception e){
            System.out.println("not a valid number"+number);
            return false;
        }
        return  true;
    }
    static boolean isValidPhoneNumber(String number){
        if (number.length()==10 && isNumber(number)){
            System.out.println(" valid ph number"+number);
            return true;
        }else
            System.out.println(" not valid ph number"+number);
            return false;
    }
}
