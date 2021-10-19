package Abstract;

public abstract class Bank {

    int amt = 100;//non static
    final int rate = 10;//final
    static int loanrate = 5;//static


    //partial abstraction
    //hiding the implementation logic ---is called abstraction
    //abstract class can have abstract methods and non abstract methods
    //cannot create the object for abstract class
    //0-100% abstraction
    public abstract void loan();// abstract method ---no body

    //non abstract methods
    public void credit() {
        System.out.println("Bank---credit");
    }

    public void debit() {
        System.out.println("Bank---debit");
    }

}
