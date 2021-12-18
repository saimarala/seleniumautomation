package JavaSessions;

import Java8.Java8Concepts;
import io.cucumber.java.bs.I;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    @Test
    void sumOfNumbers(){
        List<Integer>ls=Arrays.asList(1,2,3,4,5,6);
        Optional<Integer>sum=ls.stream().reduce((a, b)->a+b);
        System.out.println(sum.get());
    }

    @Test
    void evenOdd(){
        List<Integer>ls=Arrays.asList(1,2,3,4,5,6);
//        ls.stream().parallel().filter(e->e%2==0).forEach(System.out::println);
//        ls.parallelStream().filter(o->o%2!=0).forEach(System.out::println);

       // ls.stream().filter(e->e%2==0).forEach(System.out::println);
//        ls.stream().filter(e->e%2!=0).forEach(System.out::println);
        //IntStream.range(1,101).filter(e->e%2==0).forEach(System.out::println);
    }

    @Test
    void minAndMax(){
        int min=0;
        int a=10,b=20,c=30;

//        while(a>0||b>0||c>0){
//           a--;
//           b--;
//           c--;
//           min++;
//        }
//        System.out.println(min);
        int max=0;
        while(a>0&&b>0&&c>0){
            a--;
            b--;
            c--;
            max++;
        }
        System.out.println(max);
    }

    @Test
    void reverse(){
        List<Integer>ls=Arrays.asList(1,2,3,4,5,6,100,-1,0);
       // ls.stream().sorted().forEach(System.out::println);
       // ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        ls.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
//        Collections.sort(ls);
//        System.out.println(ls);
//        //Collections.reverse(ls);
//        Collections.sort(ls,Collections.reverseOrder());
//        System.out.println(ls);

    }

    @Test
    void minAndMaxNumber(){
        List<Integer>ls=Arrays.asList(1,2,3,4,5,6,100,-1,0);
        int max=ls.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
       int min=ls.stream().min(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(min);
    }

    @Test
    void dup(){
        List<Integer>ls=Arrays.asList(1,2,3,4,5,6,100,-1,0,2,2,1,3);
//        Set<Integer>dup=ls.parallelStream().filter(e->Collections.frequency(ls,e)>1).collect(Collectors.toSet());
//        dup.forEach(System.out::println);
        String s="";
        Integer i=null;

    }

}
