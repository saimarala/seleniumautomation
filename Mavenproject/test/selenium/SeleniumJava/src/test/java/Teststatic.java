package StaticAndNonStaticConcept;

import MyPackage.StaticAndNonStaticConcept;

public class Teststatic {

    public static void main(String[] args) {


        MyPackage.StaticAndNonStaticConcept.sum();

        System.out.println(MyPackage.StaticAndNonStaticConcept.age);
        MyPackage.StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);
        obj.sum();

    }

}
