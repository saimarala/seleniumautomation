package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism---compile-time polymorphism
		BMW obj1=new BMW();
		obj1.start();
		obj1.stop();
		obj1.theftsafety();
		System.out.println("*******************");
		Car obj2=new Car();
		obj2.start();
		obj2.stop();
		obj2.refuel();

		System.out.println("****************");
		//child class object referred by  parent class reference variable --dynamic polymorphism--runtime polymorphism
		//top casting
		Car obj3=new BMW();
		obj3.start();
		obj3.stop();
		obj3.refuel();
		
		//down casting
		BMW b1=(BMW) new Car();//classcastException

	}

}
