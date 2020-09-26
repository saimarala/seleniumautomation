package Interface;

public class TestCar {

    public static void main(String[] args) {

        BMW obj1 = new BMW();
        obj1.start();
        obj1.stop();
        obj1.refuel();
        System.out.println(obj1.wheels);
        obj1.theftSafety();
        System.out.println("**************");

        Car obj2 = new BMW();
        obj2.start();
        obj2.stop();
        obj2.refuel();
        System.out.println(obj2.wheels);


    }

}
