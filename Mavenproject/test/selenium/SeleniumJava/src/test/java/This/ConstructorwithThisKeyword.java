package This;


public class ConstructorwithThisKeyword {

    static String name;
    static int age;
    static String name1;
    static int age1;
    static int num;

    //Using �this� keyword to refer current class instance variables
    public ConstructorwithThisKeyword(String name, int age) {

        //Using this() to invoke current class constructor
        this(20);//current class constructor
        //this(num);//constructor call must be first statement
        this.name = name;//this.classvar=localvar
        this.age = age;
        name1 = name;
        age1 = age;
        System.out.println(name + ":" + age);

    }

    public ConstructorwithThisKeyword(int num) {

        this.num = num;

        System.out.println("num:" + num);

    }
    //Using �this� keyword to return the current class instance

    ////Method that returns current class instance
    public ConstructorwithThisKeyword get() {
        return (this);
    }

    void Dispaly() {
        System.out.println(num);
        System.out.println(name + ":" + age);
    }

    //Using �this� keyword as method parameter

    void dispalyMethod(ConstructorwithThisKeyword obj) {
        System.out.println("**method parameter**");
        System.out.println(num);
        System.out.println(name + ":" + age);
    }

    void getDisplay() {
        dispalyMethod(this);
    }

    //Using �this� keyword to invoke current class method
    void displays() {
        // calling fuction show() 
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }

    public static void main(String[] args) {

        ConstructorwithThisKeyword obj = new ConstructorwithThisKeyword("selenium", 34);
        ConstructorwithThisKeyword obj1 = new ConstructorwithThisKeyword(10);


        System.out.println(name + ":" + age);
        System.out.println("*****");
        System.out.println(name1);
        System.out.println(age1);
        System.out.println(num);
        System.out.println("**method**");
        obj.get().Dispaly();
        ;
        System.out.println("***");
        obj.Dispaly();
        obj.getDisplay();
        obj.displays();

    }

}
