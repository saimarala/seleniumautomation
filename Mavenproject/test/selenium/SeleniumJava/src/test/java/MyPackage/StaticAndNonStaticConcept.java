package MyPackage;

public class StaticAndNonStaticConcept {
    //global vars:scope of global variables wiil be available across all the functions with some condition
    public String name = "selenium";//non static global vars
    public static int age = 25;//static global vars

    public static void main(String[] args) {
        //how to call static methods and variables
        //direct calling
        System.out.println(age);
        sum();
        //calling by classname
        System.out.println(StaticAndNonStaticConcept.age);
        StaticAndNonStaticConcept.sum();

        //how to call non static methods ands variables

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);
        //can i access static methods by using object reference?yes
        obj.sum();
    }

    public void sendMail() {
        System.out.println("send mail method");
    }

    public static void sum() {
        System.out.println("sum method");
    }

}
