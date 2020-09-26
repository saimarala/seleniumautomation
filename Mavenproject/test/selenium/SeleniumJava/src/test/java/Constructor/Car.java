package Constructor;

public class Car {
    String name;
    int price;
    String engine;

    Car(String name, int price, String engine) {
        this.name = name;
        this.price = price;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car obj1 = new Car("BMW", 10, "Automatic");
        Car obj2 = new Car("Audi", 20, "Manual");
        System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);


        String a = "hello is";
        String b = "world";
        a = a + b;//helloworld
        //store initial string a in string b
        b = a.substring(0, a.length() - b.length());
        //store initial string b in string a
        a = a.substring(b.length());

        System.out.println("after swapping");

        System.out.println("the value of a is:" + a);
        System.out.println("the value of b is:" + b);
    }

}
