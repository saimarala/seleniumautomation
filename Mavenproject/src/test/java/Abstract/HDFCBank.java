package Abstract;

public class HDFCBank extends Bank{

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
