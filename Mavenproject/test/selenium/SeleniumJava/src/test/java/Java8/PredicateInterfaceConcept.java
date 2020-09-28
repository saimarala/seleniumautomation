package Java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {
    @Test
    void predicateTest() {
        Predicate<Integer>func=x->x<5;
        System.out.println(func.test(5));

        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>colList=list.stream().filter(func).collect(Collectors.toList());
        System.out.println(colList);

        //predicate with &&
        List<Integer>colList1=  list.stream().filter(x->x>5 && x<9).collect(Collectors.toList());
        System.out.println("with &&"+colList1);
        //predicate with negate()
        List<String>nameList=Arrays.asList("Sai","Sa","Java","Sae","Selenium");
        Predicate<String>nameExp=x->x.startsWith("Sa");
        List<String>newNameList=nameList.stream().filter(nameExp.negate()).collect(Collectors.toList());
        System.out.println(newNameList);



    }
}
