package JavaSessions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
//        ls.stream().filter(e->e%2==0).forEach(System.out::println);
//        ls.stream().filter(e->e%2!=0).forEach(System.out::println);
        IntStream.range(1,101).filter(e->e%2==0).forEach(System.out::println);
    }
}
