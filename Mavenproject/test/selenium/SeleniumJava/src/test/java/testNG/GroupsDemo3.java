package testNG;

import org.testng.annotations.Test;

public class GroupsDemo3 {

    @Test(groups = {"sanity","regression"})
    void test1(){
        System.out.println("GroupsDemo3 test1");
    }

    @Test(groups = "sanity")
    void test2(){
        System.out.println("GroupsDemo3 test2");
    }

    @Test(groups = "sanity")
    void test3(){
        System.out.println("GroupsDemo3 test3");
    }

    @Test(groups = "regression")
    void test4(){
        System.out.println("GroupsDemo3 test4");
    }
    @Test(groups = {"sanity","regression"})
    void test5(){
        System.out.println("GroupsDemo3 test5");
    }

}
