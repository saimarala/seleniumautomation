package Abstract;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank obj1=new HDFCBank();
		obj1.credit();
		obj1.debit();
		obj1.loan();
		obj1.roi();
		
		System.out.println("**************");
		Bank obj2=new HDFCBank();
		obj2.loan();
		obj2.credit();
		obj2.debit();
		

	}

}
