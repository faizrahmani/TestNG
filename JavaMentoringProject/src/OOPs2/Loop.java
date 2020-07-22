package OOPs2;

public class Loop {

	public static void main(String[] args) {


		//1. while loop:
		//Disadvantage of while loop is that it will generate infinite loop if you don’t give increment/decrement part
		
		int i=1; // initialization 
		while(i<=10) {   // Conditional
			System.out.println(i);
			i++;  // increment/decrement
			// i++ means i=i+1
		}
		
		System.out.println("***********************");
		
		//2. for loop
		for(int j=1;j<=10;j++) {  // Initialization; Conditional; Incremental
			System.out.println(j);
		}
		
		//print 10 to 1
		// k-- means k=k-1
		//10 9 8 7 6 5 4 3 2 1 
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
		for(int r=-1;r>=-10;r--) {
			System.out.println(r);
		}

	}

}
