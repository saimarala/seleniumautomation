package Interface;

public class BMW implements Car{
	//if a class is  implements any interface ,then its mandatory to define/override all the methods 
	
	public void start() {
		System.out.println("BMW---start");
		
	}

	
	public void stop() {
		System.out.println("BMW---stop");
		
	}

	
	public void refuel() {
		System.out.println("BMW---refuel");
		
	}
	
	public void theftSafety() {
		
		System.out.println("BMW---theftSafety");
		
	}

}
