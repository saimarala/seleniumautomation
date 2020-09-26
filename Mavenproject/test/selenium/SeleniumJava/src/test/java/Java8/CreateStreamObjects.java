package Java8;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    @Test
    public void streamObjects(){
        //Create stream
        Stream<String>stream=Stream.of("a","b","c");
       // stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);
    //Create a stream from resources
        Collection<String> collection=Arrays.asList("Selenium","java","UFt");
        collection.stream().forEach(s -> System.out.println(s));
        Stream<String> stream1=collection.stream();
        stream1.forEach(System.out::println);
        List<String>list=new ArrayList<String>(collection);
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("***Hashset**");
        Set<String>set=new HashSet<String>(list);
        set.stream().forEach(s -> System.out.println(s));
        System.out.println("***arrays**");
        String[] strArray={"a","b","c"};
        Arrays.stream(strArray).forEach(s -> System.out.println(s));


         }
}
