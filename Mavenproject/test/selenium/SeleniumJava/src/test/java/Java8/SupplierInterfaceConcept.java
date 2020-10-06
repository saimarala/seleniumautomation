package Java8;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceConcept {
    //takes no arguments and return a list
    @Test
    void supplyTest(){
      Supplier<LocalDateTime> func=()->LocalDateTime.now(ZoneId.of("GMT+8"));
      System.out.println(func.get());
      System.out.println(LocalDateTime.now());
       // LocalDateTime time=LocalDateTime.now();

    }
    @Test
    void otpGenerate(){
        Supplier<String> fun=()->{
            String otp="";
            for (int i=0;i<6;i++){
            otp=otp +(int) (Math.random()*10);
        }
        return otp;
        };
        System.out.println(fun.get());
        System.out.println(fun.get());

    }





}
