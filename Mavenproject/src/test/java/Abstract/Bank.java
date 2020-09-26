package Abstract;

public abstract class Bank {
	
		int amt=100;
		final int rate=10;
		static int loanrate=5;
	
	
	
	//partial abstraction
	//hiding the implementation logic ---is called abstraction
	//abstract class can have abstract methods and non abstract methods
	//cannot create the object for abstract class
	public abstract void loan();// abstract method ---no body
	 
	//non abstract methods
	public  void credit() {
		System.out.println("Bank---credit");
	}
	
	public  void debit() {
		System.out.println("Bank---debit");
	}

}
