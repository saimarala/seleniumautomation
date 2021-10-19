package Methodoverlading;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.sum();
        obj.sum(10);
        obj.sum(20.22);
        obj.sum(10,20);
        main(100);
        main(50,70);

    }
    //you can not create a method inside a method
    //duplicate methods i.e same method name with same number of arguments are not allowed
    //method overloading --> when method name is same with different arguments
    //or input parameters within the same class


     void sum() {
        System.out.println("sum method--zero param");
    }
    void sum(int i){
        System.out.println("sum method--1 param");
        System.out.println(i);
    }
    void sum(double i){
        System.out.println("sum method--1 param");
        System.out.println(i);
    }
    void sum(int i,int j){
        System.out.println("sum method--2 param");
        System.out.println(i+j);
    }

    public static void main(int a) {//we can overload main method also
        System.out.println("main 1 param");
        System.out.println(a);
    }

    public static void main(int a,int b) {
        System.out.println("main 2 param");
        System.out.println(a+b);
    }
}