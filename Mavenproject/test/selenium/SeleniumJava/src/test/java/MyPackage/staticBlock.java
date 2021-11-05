package MyPackage;

public class staticBlock {
//    Q1. Explain static blocks in Java ?
//    Q2. How can we run a java program without making any object?
//    Q3. Similarity and Difference between static block and static method ?
//    Q4. How can we create objects if we make the constructor private ?
//    Q5. Is it possible to compile and run a Java program without writing main( ) method?
//    Q6. Can we initialize member variables within static block ?

    //Q1. Explain static blocks in Java ?
//    static {// first it will run static block
//        System.out.println("static block1");
//    }
//    static {
//        System.out.println("static block2");
//    }
//    static {
//        System.out.println("static block3");
//    }
////    Q2. How can we run a java program without making any object?
//    static {
//        System.out.println("static block1");
//    }
//    static void test(){
//        System.out.println("test method");
//    }
//    static  void cover(){
//        System.out.println("cover method");
//        test();
//    }

//    // Q4. How can we create objects if we make the constructor private ?
    int age;
    static {
        staticBlock obj=new staticBlock();
    }
    public static int createObject(){
        staticBlock obj1=new staticBlock();
        obj1.age=40;
        return obj1.age;
    }

    private staticBlock(){
        age=30;
    }
    public static void main(String[] args) {
        System.out.println("main method");
//        test();
//        staticBlock.test();
//        cover();
        //Q4
        staticBlock obj=new staticBlock();
        System.out.println(obj.age);
    }


}
