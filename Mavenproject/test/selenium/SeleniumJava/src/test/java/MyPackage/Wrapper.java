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
       int x= Integer.valueOf(z);//Unnecessary boxing 'Integer.valueOf(z)'

        //int to string
        System.out.println("int to string");
        int k = 200;
        String d = String.valueOf(k);
        String.valueOf(d);//Unnecessary 'String.valueOf()' call
        System.out.println(d + 20);
        String e = Integer.toString(k);
        System.out.println(e + 20);
        System.out.println(k + 20);

        //string to double
        System.out.println("string to double");
        String l = "120";
        double db = Double.parseDouble(l);
        double db1=Double.valueOf(l);
        Double.valueOf(db1);//Result of 'Double.valueOf()' is ignored
        System.out.println(db + 12);
        //double to string//
        String l1=Double.toString(db1);

        //String to boolean
        System.out.println("string to double");
        String t = "true";
        boolean b = Boolean.parseBoolean(t);

        System.out.println(b);
        //boolean to string
        String bs=Boolean.toString(b);

        //String to long
        String f="123456788";
        long lon=Long.parseLong(f);
        long lon1=Long.valueOf(f);
        //long to string
        String s=Long.toString(lon);

        int u=12;
        Integer c=u;
        System.out.println(c);
        Integer h=new Integer(u);//premitive type to Integer object
        System.out.println(h);
//
//        String s = "100A";
//        int a = Integer.parseInt(s);//number format exception
//        System.out.println(a);

        //The wrapper class in Java provides the mechanism to
        // convert primitive into object and
        // object into primitive.
//        byte b=10;
//        short s=20;
//        int i=30;
//        long l=40;
//        float f=50.0F;
//        double d=60.0D;
//        char c='a';
//        boolean b2=true;

        //Autoboxing: Converting primitives into objects
//        Byte byteobj=b;
//        Short shortobj=s;
//        Integer intobj=i;
//        Long longobj=l;
//        Float floatobj=f;
//        Double doubleobj=d;
//        Character charobj=c;
//        Boolean boolobj=b2;
//
//        //Printing objects
//        System.out.println("---Printing object values---");
//        System.out.println("Byte object: "+byteobj);
//        System.out.println("Short object: "+shortobj);
//        System.out.println("Integer object: "+intobj);
//        System.out.println("Long object: "+longobj);
//        System.out.println("Float object: "+floatobj);
//        System.out.println("Double object: "+doubleobj);
//        System.out.println("Character object: "+charobj);
//        System.out.println("Boolean object: "+boolobj);
//        //Unboxing: Converting Objects to Primitives
//        byte bytevalue=byteobj;
//        short shortvalue=shortobj;
//        int intvalue=intobj;
//        long longvalue=longobj;
//        float floatvalue=floatobj;
//        double doublevalue=doubleobj;
//        char charvalue=charobj;
//        boolean boolvalue=boolobj;
//
//        //Printing primitives
//        System.out.println("---Printing primitive values---");
//        System.out.println("byte value: "+bytevalue);
//        System.out.println("short value: "+shortvalue);
//        System.out.println("int value: "+intvalue);
//        System.out.println("long value: "+longvalue);
//        System.out.println("float value: "+floatvalue);
//        System.out.println("double value: "+doublevalue);
//        System.out.println("char value: "+charvalue);
//        System.out.println("boolean value: "+boolvalue);


    }

}
