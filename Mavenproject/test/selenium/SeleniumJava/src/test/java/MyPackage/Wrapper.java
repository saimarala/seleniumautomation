package MyPackage;

public class Wrapper {

    public static void main(String[] args) {
        String i = "100";
        //string to integer
        System.out.println("String to integer");
        int j = Integer.parseInt(i);
        int z=Integer.valueOf(i);
        System.out.println(j + 20);
        System.out.println(i + 20);

        //int to string
        System.out.println("int to string");
        int k = 200;
        String d = String.valueOf(k);
        System.out.println(d + 20);
        String e = Integer.toString(k);
        System.out.println(e + 20);
        System.out.println(k + 20);

        //string to double
        System.out.println("string to double");
        String l = "120";
        double db = Double.parseDouble(l);
        System.out.println(db + 12);

        //String to boolean
        System.out.println("string to double");
        String t = "true";
        boolean b = Boolean.parseBoolean(t);
        
        System.out.println(b);

        //long
        String f="123456788";
        long lon=Long.parseLong(f);

        int u=12;
        Integer c=u;
        System.out.println(c);
        Integer h=new Integer(u);//premitive type to Integer object
        System.out.println(h);

        String s = "100A";
        int a = Integer.parseInt(s);//number format exception
        System.out.println(a);



    }

}
