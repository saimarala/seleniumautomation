package Java8;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceConcept {
    //takes no arguments and return a list
    @Test
    void supplyTest(){
      Supplier<LocalDateTime> func=()->LocalDateTime.now();
      System.out.println(func.get());
      System.out.println(LocalDateTime.now());

    }





}
