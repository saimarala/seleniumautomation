package Methodoverlading;

public class FunctionsinJava {

    public static void main(String[] args) {
        //create
        FunctionsinJava obj = new FunctionsinJava();
        obj.test();
        System.out.println(obj.sum());
        int a = obj.sum();
        System.out.println("***" + a);
        String s = obj.PQR();
        System.out.println(s + " automation");
        int d = obj.div(10, 20);
        System.out.println(d);
        int d1 = obj.div(30, 50);
        System.out.println(d1);

        //1.cannot create function inside a function
        //2.functions are independent each other
        //3.functions are parallel to each other
        //4.main method does not return any value ,hence it is void

    }


    //1.no input and no output
    //void-- does not return any value
    public void test() {//0 param
        System.out.println("test method");
    }

    public void test(int i) {//1 param
        System.out.println("test method");


    }

    public void test(String i) {//1 param
        System.out.println("test method");
    }

    public void test(int x, int y) {//2 params
        System.out.println("test method");
    }

    public void test(String x, String y) {
        System.out.println("test method");
    }

    //Method Overloading:when in the same class ,functions/methods are having same name with different parameters

    //2.no input and some output
    //return type int
    public int sum() {
        System.out.println("sum method");
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    public String PQR() {
        System.out.println("PQR method");
        String s = "selenium";
        return s;
    }

    //3. some input and some output
    public int div(int x, int y) {
        System.out.println("DIV method");
        int z = x / y;
        return z;
    }

    public String sendMail(int p, String q) {
        System.out.println("sendMail method");
        String h = p + q;
        return h;
    }
}
