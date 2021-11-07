package Java8;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

        @Test
        void demo1(){
            List<Integer>numberList= Arrays.asList(10,20,40,40,55,15,65,100);
            List<Integer>evenNumberList=new ArrayList<>();
           // numberList.stream().filter(n->n%2==0).forEach(System.out::println);
            //numberList.stream().filter(n->n%2==0).forEach(s->System.out.println(s));
            evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
            System.out.println(evenNumberList);
        }
        @Test
        void demo2(){
            List<String>names=Arrays.asList("Automation","Selenium","Java","Joffery","Sansa");
            List<String>longNames=new ArrayList<>();
           longNames= names.stream().filter(s->s.length()>4 && s.length()<10).collect(Collectors.toList());
           System.out.println(longNames);
           names.stream().filter(s->s.length()>6 && s.length()<10).forEach(System.out::println);
           System.out.println("***********");
           names.stream().filter(s -> s.length()>7 && s.length()<=10).forEach(s->System.out.println(s));
            System.out.println("***********");
            names.stream().parallel().filter(s -> s.length()>7 && s.length()<=10).forEach(s->System.out.println(s));
        }
        @Test
        void demo3(){
            List<String>words=Arrays.asList("cup",null,"forest",null,"sky","book");
            List<String>result=words.stream().filter(s->s!=null).collect(Collectors.toList());
            System.out.println(result);
        }
}
