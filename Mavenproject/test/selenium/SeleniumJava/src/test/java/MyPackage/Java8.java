package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import util.TestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 extends TestUtils {
    @Test
    public void testing() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("UFT");
        names.add("Selenium");
        names.add("Se");
        names.add("AUtomation");
        long count = names.stream().filter(s -> s.startsWith("S")).count();
        System.out.println(count);

        long d = Stream.of("UFT", "Selenium", "Se", "Java").filter(a ->
                {
                    a.startsWith("S");
                    return true;
                }
        ).count();
        System.out.println(d);

        //greater than 4
        // names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
    }

    //Map
    @Test
    public void streamMap() {
        //print names which have last letters a "m" with upper case
        Stream.of("Selenium", "Automation", "Javam", "Saim").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()
        ).forEach(s -> System.out.println(s));
        //print the names which has first letter as "s" with uppercase and sorted
        List<String> arr = Arrays.asList("Selenium", "Automation", "Javam", "Saim");
        arr.stream().filter(s -> s.startsWith("S")).map(s -> s.toUpperCase()).sorted()
                .forEach(s -> System.out.println(s));


        List<String> arr1 = Arrays.asList("Hp", "cg", "hpe");
        //concat
        Stream<String> newStream = Stream.concat(arr.stream(), arr1.stream());
        System.out.println("*****concat start**********");
        //    newStream.sorted().forEach(s -> System.out.println(s));
        System.out.println("*****concat end**********");
        System.out.println("*****boolean start**********");
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("hp"));
        Assert.assertTrue(flag);
        System.out.println("*****boolean end**********");

    }

    @Test
    public void streamCollect() {
        List<String> ls = Stream.of("aaaam", "cccc", "zzzzm", "yyyy").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));
        Set<String> lset = Stream.of("aaaam", "cccc", "zzzzm", "yyyy").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase())
                .collect(Collectors.toSet());
        //System.out.println(lset.p);

        List<Integer> values = Arrays.asList(3, 10, 1, 2, 3, 4, 5, 1, 2);
        //print unique numbe from array
        System.out.println("unique order");
        values.stream().distinct().forEach(s -> System.out.println(s));
        //sort the array
        System.out.println("Sorted order");
        values.stream().distinct().sorted().forEach(s -> System.out.println(s));
        System.out.println("index of 3");
        List<Integer> intvalues = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(intvalues.get(2));
    }

    @Test
    public void testcol() throws Throwable {
        TestUtils.getDriver("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");
        // List<WebElement> originalList=driver.findElements(By.xpath("//select[@id='city']"));
        List<WebElement> originalList = driver.findElements(By.xpath("//select[@id='country']"));
        List<String> origionalTextList = originalList.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> sortedList = origionalTextList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(origionalTextList.equals(sortedList));


    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }


}
