package Abstract;

public class HDFCBank extends Bank {
    ////if a class is  extends any abstract class
    // then its mandatory to define/override all the abstratct methods
    @Override
    public void loan() {
        System.out.println("HDFC--LOAN Method");
    }

    public void debit() {
        System.out.println("HDFC---debit");
    }
    public void roi() {
        System.out.println("HDFC---ROI");
    }
}
