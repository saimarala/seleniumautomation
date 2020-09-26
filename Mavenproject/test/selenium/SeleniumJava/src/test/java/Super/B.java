package Super;

public class B extends A {
    //suoer keyword should be first line
    // used to call parent class constructor
    public B() {
        super(10);
        System.out.println("child class constructor");
    }

    public B(int i, int j) {
        super(i, j);
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(10, 20);

    }

}
