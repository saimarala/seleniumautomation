package MyPackage;

public class Stringmanipulation {

    public static void main(String[] args) {

        String str = "this is selenium";
        String str1 = "THIS is selenium";

        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf('i'));//1st occurrence
        System.out.println(str.indexOf('i', str.indexOf('i') + 1));//2nd occurrence
        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));//3 occurrence
        System.out.println(str.indexOf("this"));
        System.out.println(str.indexOf('z'));
        System.out.println(str.indexOf("sai"));
        System.out.println(str.lastIndexOf('m'));
        System.out.println(str.lastIndexOf('i'));
        System.out.println(str.lastIndexOf('i', str.lastIndexOf('i') - 1));

        //string comparison

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        //subsequence
        System.out.println(str.subSequence(0, str.length()));
        //substring
        System.out.println(str.substring(0));
        System.out.println(str.substring(0, str.length()));
        //trim
        String s = "  hello world";
        System.out.println(s.trim());
        System.out.println(s.replace(" ", ""));
        String str2 = "this";
        String str3 = "SELENIUM";
        int i = 20;
        System.out.println(str2.length());
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toString());
        //split
        String s4 = "this is selenium";
        String p[] = s4.split(" ");
        String tot = "";
        for (int j = 0; j < p.length; j++) {

            String word = p[j];
            tot = tot + word;

        }
        System.out.println(tot);

        String x = "hello";
        String y = "world";
        int a = 100;
        int b = 200;
        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(x + y + a + b);
        System.out.println(a + b + x + y);
        System.out.println(x + y + (a + b));
    }

}
