package Java8;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapDemo {

    @Test
    void mapDemo1(){
        List<String>vehicles= Arrays.asList("bus","car","bicycle","flight","train");
        List<String>vechileListUpeerCase=new ArrayList<>();
//        for (String name:vehicles){
//            vechileListUpeerCase.add(name.toUpperCase(Locale.ROOT));
//        }
//        System.out.println(vechileListUpeerCase);
        vechileListUpeerCase=vehicles.stream().map(u->u.toUpperCase()).collect(Collectors.toList());
        System.out.println(vechileListUpeerCase);
    }

    @Test
    void mapDemo2(){
        List<String>vehicles1= Arrays.asList("bus","car","bicycle","flight","train");
        vehicles1.stream().map(s->s.length()).forEach(System.out::println);
    }


    @Test
    void MapDemo3(){
      List<Integer>numberList=Arrays.asList(1,2,3,4,5);
      List<Integer>multipliedList=new ArrayList<>();
      numberList=numberList.stream().map(n->n*3).collect(Collectors.toList());
      System.out.println(numberList);
      System.out.println("*********");
      numberList.stream().map(n->n*2).forEach(System.out::println);
    }
}
