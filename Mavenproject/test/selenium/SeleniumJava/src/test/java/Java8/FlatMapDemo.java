package Java8;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    @Test
    void demo1(){
      //map
        List<Integer>lst1= Arrays.asList(1,2,3,4,5);
        List<Integer>lst2=lst1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(lst2);

        //flatmap
        List<Integer>list1= Arrays.asList(1,2);
        List<Integer>list2= Arrays.asList(3,4);
        List<Integer>list3= Arrays.asList(5,6);
       List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
      // List<Integer>finalresult=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        List<Integer>finalresult=finalList.stream().flatMap(x->x.stream().map(n->n+20)).collect(Collectors.toList());
       System.out.println(finalresult);

    }
    @Test
    void demo2(){
        List<String>teamA= Arrays.asList("selenium","test","java");
        List<String>teamB= Arrays.asList("UFT","testing","vbscript");
        List<String>teamC= Arrays.asList("selenium java","test java","core java");
        List<List<String>>playersinWorldCup=new ArrayList<>();
        playersinWorldCup.add(teamA);
        playersinWorldCup.add(teamB);
        playersinWorldCup.add(teamC);
        List<String>names=playersinWorldCup.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(names);
    }
}
