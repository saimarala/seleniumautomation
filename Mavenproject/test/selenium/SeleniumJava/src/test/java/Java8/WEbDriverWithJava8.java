package Java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import util.SeleniumBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WEbDriverWithJava8 extends SeleniumBase {
    @Test
    void java8automation() throws Throwable {
        getDriver("https://www.amazon.in/","chrome");
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println(linksList.size());

        //1
        //linksList.forEach(s->System.out.println(s.getText()));
        //2
//        List<String>collectlList=linksList.stream().filter(ele ->!ele.getText().equals("")).map(ele->ele.getText()).collect(Collectors.toList());
//        collectlList.forEach(System.out::println);
//        System.out.println("**lambda**");
//        collectlList.forEach(s -> System.out.println(s));
        //3
//        System.out.println("**find first**");
//        System.out.println(linksList.stream().filter(ele->!ele.getText().equals("")).findFirst().get().getText());
//        //4
//        System.out.println("**find any**");
//        String findAny=linksList.stream().filter(ele->!ele.getText().equals("")).findAny().get().getText();
//        System.out.println(findAny);
        ////5. exclude blank texts and which starts with or contains Amazon
//        Set<String>collectionSet=linksList.stream().filter(ele->!ele.getText().equals("") && ele.getText().contains("Amazon")).
//                map(ele->ele.getText()).collect(Collectors.toSet());
//        collectionSet.forEach(System.out::println);
        //6.
        List<String> AllLinkTextList = linksList.stream()
                .filter(ele->!ele.getText().isEmpty())
                .filter(ele->!ele.getText().startsWith(" "))
                .map(ele->ele.getText().trim())
                .collect(Collectors.toList());
        AllLinkTextList.forEach(System.out::println);



    }
    @AfterClass
    void logout(){
        tearDown();
    }
}
