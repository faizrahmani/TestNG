package OOPs2;

public class DataOverRiding {

	public static void main(String[] args) {


		// Static polymorphism -- compile-time polymorphism
		BMW b=new BMW ();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*********************");
		
		Car c=new Car();
		// parent class can not inherit from child class
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		
		//We can refer child class object to parent class, but still we can not inherit methods from child to parent
// Child class object can be referred by parent class reference variable, which is called dynamic polymorphism or Run-time polymorphism		
		//Top Casting
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		// as here we can not call c1.theftsafety method from BMW class
		
		//Down Casting: we can create down casting by giving child class reference object 
		BMW b1=(BMW)new Car(); // but it will give thread error of parent cannot be casted to child

	}

}
