package MyPackage;

public class Teststatic {

    public static void main(String[] args) {


        StaticAndNonStaticConcept.sum();

        System.out.println(StaticAndNonStaticConcept.age);
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);
        obj.sum();

    }

}
