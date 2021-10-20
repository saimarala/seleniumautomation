package Methodoverlading;

import java.util.ArrayList;

public class FunctionsinJava {

    public static void main(String[] args) {
        //create
        FunctionsinJava obj = new FunctionsinJava();
        obj.test();
        String s1=obj.getName();
        int a = obj.sum();
        System.out.println("***" + a);
        ArrayList<String>ar1=obj.getStudnetNames();
        System.out.println(ar1);
        int marks[]=obj.getMarks();
        for(int ar:marks){
            System.out.println(ar);
        }
        int d = obj.div(10, 20);
        System.out.println(d);
        String country=obj.getCountryName("Pune");
        System.out.println(country);

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
    //2.no input and sum output
    public String getName() {//1 param
        System.out.println("get Name");
        String s="selenium";
        return s;
    }
    public int sum() {
        System.out.println("sum method");
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
    public ArrayList<String> getStudnetNames(){
        System.out.println("getStudnetNames");
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Sai");
        ar.add("Selenium");
        ar.add("Java");
        return ar;
    }
    public int[] getMarks(){
        System.out.println("get marks method");
        int marks[]=new int[4];
        marks[0]=10;
        marks[1]=7;
        marks[3]=9;
        return marks;
    }
    //3.some ip and some return
    public int div(int x, int y) {
        System.out.println("DIV method");
        int z = x / y;
        return z;
    }

    public String getCountryName(String cityName) {
        System.out.println("getCountryName");
        if (cityName.equals("bangalore")){
            return "India";
        }else if(cityName.equals("london")){
            return "UK";
        }else if(cityName.equals("New York")){
            return "US";
        }
        return cityName+" will be added later , currently data is not available";
    }

    public void test(int x, int y) {//2 params
        System.out.println("test method");
    }

    public void test(String x, String y) {
        System.out.println("test method");
    }

}
