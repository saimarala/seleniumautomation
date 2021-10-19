package Interface;

public interface USMedical extends WHO {
   int min_fee=10;
    public void physioServicess();
    public void oncologyServices();
    public void orthopedicServices();
    public void RadiologyService();

    //  can not create the object of interface
    // only method declaration- method prototype--no method body
    // can not create static prototype method in interface
    //but interface vars are static and final

    //we achieve 100% abstraction
    // always define only abstract methods

    //From JDK1.8 ,you can have static methods in interface but with the method body
    //We can not override static method
    public static void Services_119(){
        System.out.println("US - 911 services.....");
    }
    //We can not override default method
    default void interShip(){
        System.out.println("US - intership...");
    }
}
