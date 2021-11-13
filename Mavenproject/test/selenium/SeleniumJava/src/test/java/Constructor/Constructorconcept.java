package Constructor;

public class Constructorconcept {

    static int age = 50;
    String name;

    public Constructorconcept() {
        //this(10);//constructor chaining and it should be first line 
        this(10,20);
        System.out.println("default constructor");
    }

    public Constructorconcept(int i) {
        System.out.println("1 param");
        System.out.println(i);
    }

    public Constructorconcept(int i, int j) {
        System.out.println("2 param");
        System.out.println(i + " " + j);
    }
        //this keyword used when we initilaze the class variable to local varaible
    public Constructorconcept(int age, String name) {
        this.age = age;//this.classvar=localvar
        this.name = name;
    }

    public static void main(String[] args) {

        Constructorconcept obj1 = new Constructorconcept();
        Constructorconcept obj2 = new Constructorconcept(10);
        Constructorconcept obj3 = new Constructorconcept(10, 20);

        System.out.println(age);
        Constructorconcept obj4 = new Constructorconcept(20, "selenium");
        System.out.println(obj4.age);
        System.out.println(obj4.name);
        System.out.println(age);


    }

}
