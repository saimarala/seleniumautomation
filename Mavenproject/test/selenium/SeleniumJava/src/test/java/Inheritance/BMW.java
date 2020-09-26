package Inheritance;

public class BMW extends Car {

    //when same method is present in parent class as well as child class with same name and same number of arguments
    //is called method-overriding
    public void start() {//overridden method
        System.out.println("BMW---start");
    }

    public void theftsafety() {
        System.out.println("BMW---theftsafety");
        sample();
    }


}
