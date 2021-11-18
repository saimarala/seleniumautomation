package MyPackage;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PasswordStore {
    @Test
   void  password(){
        String pwd="Selenium123";
        System.out.println("pwd :"+pwd);

        char c[]= new char[]{'S','e','l','e','n','i','u','m','1','2','3'};
        System.out.println("pwd :"+c);
        Arrays.fill(c,'*');
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }

        String s1="Automation";
        String s2=s1;
        s1="Testing";
        System.out.println(s1+":"+s2);
    }
}
