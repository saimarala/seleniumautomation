package JavaSessions;

import org.testng.annotations.Test;

public class NullArguments {
    //pass null arguments with method overloading with string and object types
    @Test
    void validate(){
        test(null);
    }

    public static void test(Object o){
        System.out.println("Object argument");
    }
    public static void test(String s){
        System.out.println("String argument");
    }
    //    public static void test(StringBuffer b){
    //        System.out.println("String argument");
    //    }
}
