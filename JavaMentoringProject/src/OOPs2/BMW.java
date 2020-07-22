package OOPs2;


	
	public class BMW extends Car {  
		// "has a relationship" 
		//Has a relationship is when there is relationship between class and class
		
		
		//When same method is present in parent class as well as in child class with the same name 
		//and same number of arguments is called Method-Overriding. 
		public void start() {
			System.out.println("BMW---start");
		}
		
		public void theftSafety() {
			System.out.println("BMW Theft Safety");
		}

}
