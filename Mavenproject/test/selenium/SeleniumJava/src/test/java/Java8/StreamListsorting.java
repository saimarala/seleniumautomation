package Java8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListsorting {
    public static final String ss="chromepath";
    @Test
    public void sortedTest(){
       List<String>fruits= Arrays.asList("Banana","Apple","Mango","Orange","Orange");
       fruits.stream().sorted().forEach(s -> System.out.println(s));
       List<String>fr=fruits.stream().distinct().sorted().collect(Collectors.toList());
       fr.forEach(s->System.out.println(s));
       System.out.println("*********condition****");
       fruits.stream().filter(s -> !s.equals("Orange")).sorted().forEach(s -> System.out.println(s));
        List<String> con=fruits.stream().filter(s -> !s.equals("Orange")).sorted().collect(Collectors.toList());
        con.forEach(s -> System.out.println(s));
        con.forEach(System.out::println);
        int a=1;
        int b=2;

//        if(a<b){
//
//            System.out.println("a<b");
//        }else {
//            System.out.println("a>b");
//        }
         System.out.println(a > b ? "a is grear than b" : "a is less than b");



    }
}
