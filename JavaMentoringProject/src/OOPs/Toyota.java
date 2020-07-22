package OOPs;

public class Toyota extends Vehicle {

	public static void main(String[] args) {
		Toyota toy=new Toyota();
		toy.engine();
		toy.brake();
		

	}

	@Override
	public void engine() {
		System.out.println("Toyota engine");
		
	}

}
