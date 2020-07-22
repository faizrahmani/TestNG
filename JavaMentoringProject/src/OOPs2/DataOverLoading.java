package OOPs2;

public class DataOverLoading {

	public static void main(String[] args) {
		
		//MethodOverloading is when the method name is same with different arguments, data types or input parameters within the same class
		DataOverLoading obj=new DataOverLoading();
			
			obj.sum();
			obj.sum(33);
			obj.sum(22.33);
			obj.sum(20, 30);
			
			
		}

		public static void main(int k) {
			
		} // We can overload main method also with different data type or different number of parameters
		public static void main(int h, int t) {
			
		}
		
		// we can not create a method inside the a method
		// Duplicate methods means same method name with same number or type of argument, which are not allowed
		
		public void sum() { // 0 input parameter
			System.out.println("Sum method with zero parameter");
		}
		
		public void sum(int a) { // one int input parameter
			System.out.println("Sum method with one parameter");
			System.out.println(a);
		}
		public void sum(double b) { // one double input parameter
			System.out.println("sum method with one parameter but different data type");
			System.out.println(b);
		}
		public void sum(int c, int d) { // two input parameter
			System.out.println("sum method with two parameters");
			System.out.println(c*d);

	}

}
