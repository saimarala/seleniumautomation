package Inheritance;

public class TestCar {

    public static void main(String[] args) {
        //We can not overide the static,private and final
        //static polymorphism---compile-time polymorphism
        //polymorphism means one to many methods(metod overiding)
        BMW obj1 = new BMW();
        obj1.start();
        obj1.stop();
        obj1.theftsafety();
        obj1.refuel();
        obj1.engine();
        System.out.println("*******************");
        Car obj2 = new Car();
        obj2.start();
        obj2.stop();
        obj2.refuel();
        obj2.engine();

        System.out.println("****************");
        //child class object referred by  parent class reference variable --dynamic polymorphism--runtime polymorphism
        //top casting
        Car obj3 = new BMW();
        obj3.start();
        obj3.stop();
        obj3.refuel();
        obj3.engine();


        //down casting
        BMW b1 = (BMW) new Car();//classcastException
        b1.refuel();
        b1.theftsafety();
        b1.start();
        b1.stop();
        b1.engine();


    }

}
