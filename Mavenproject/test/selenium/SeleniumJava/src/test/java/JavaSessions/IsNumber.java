package JavaSessions;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class IsNumber {

    @Test
    void isNumber(){
       // isValidPhoneNumber("1234567891");
        System.out.println(isCorrectPhoneNumber("123456789a"));
       // int ar[]=new int[]{1,3,5,0,0,100,-1};
        int ar[]={1,3,5,0,0,100,-1};
        System.out.println(Arrays.toString(shiftZeroTORight(ar)));
        getCharPercentage("This isSelenium123@#$$SSAA");
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
    static boolean isCorrectPhoneNumber(String number){
       // return number.matches("[0-9]{10}");
        return number.matches("\\d{10}");
    }

    static int[] shiftZeroTORight(int [] a){
        if(a.length==1){
            return a;
        }
            int count=0;
            int arr[]=new int[a.length];
            for (int number:a){
                if(number!=0){
                    arr[count]=number;
                    count++;
                }
            }
            return arr;
    }

    static void getCharPercentage(String str){
        int upperCaseCount=0 ,lowerCaseCount=0,digits=0,specChars=0;
        int len=str.length();

        for (char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else {
                specChars++;
            }
        }
        Double upperCasePercentage=(upperCaseCount*100.00)/len;
        Double lowerCasePercentage=(lowerCaseCount*100.00)/len;
        Double digitsPercentage=(digits*100.00)/len;
        Double specCharPercentage=(specChars*100.00)/len;

        DecimalFormat formater=new DecimalFormat("##.##");
        System.out.println("upper case %-->"+formater.format(upperCasePercentage));
        System.out.println("lower case %-->"+formater.format(lowerCasePercentage));
        System.out.println("digits %-->"+formater.format(digitsPercentage));
        System.out.println("specChars %-->"+formater.format(specCharPercentage));

    }
}
