package MyPackage;

import org.testng.annotations.*;
import java.util.*;

public class DuplicateElements {

    @Test
    void findDuplicate() {
        String names[] = {"Java", "Selenium", "Java", "Sel", "Sel"};
//
//        for (int i = 0; i < names.length; i++) {
//            for (int j = i + 1; j < names.length; j++) {
//                if (names[i] == names[j]) System.out.println("Duplicate element:" + names[i]);
//            }
//        }
        // Arrays.stream(names).distinct().forEach(System.out::println);

//        HashSet<String>hs=new HashSet<>();
//        for (String e:names){
//            if(hs.add(e)==false)System.out.println("Duplicate element:" + e);
//        }
        String val="";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String e : names) {
            Integer count = hm.get(e);
            if (count == null) {
                hm.put(e, 1);
            } else {
                hm.put(e, ++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
               // System.out.println("Duplicate element:" + entry.getKey());
                val=val+" "+entry.getKey();
            }
        }
         System.out.println("Duplicate element:" + val);
    }


}
