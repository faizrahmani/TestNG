package OOPs2;

public class ArrayConcept {

	public static void main(String[] args) {


		//Array is used to store similar data types in a array variable 
		//1. int array
		//lowest bound/index=0
		//upper bound/index=n-1(n is size of array, so here upper will be 3 (int i[] =new int[4];)
		
		//One Dim array
		
		//Dis-advantage of array:
		//1. Size is fixed -- static array -- To overcome to this problem -- we use collections, ArrayList, HashTable, and dynamic array. 
		//2. Stores only similar data types. -- To overcome on this problem, we use Object array

		int i[] =new int[4];
		

		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		//To print all the values of array we should use for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}
		
		/*//2. double array:
		double d[]=new double[3];
		
		d[0]=12.44;
		d[1]=44.88;
		d[2]=45.66;
		
		//3. char:
		char c[]=new char[3];
		c[0]='A';
		c[1]='&';
		c[2]='$';
		
		boolean bol[]=new boolean[2];
		
		bol[0]=true;
		bol[1]=false;
		
		String s[]=new String[3];
		s[0]="Hello";
		s[1]="World";
		s[2]="Data";
		for(int k=0;k<s.length;k++) {
		System.out.println(s[k]);*/
		//}
				
		//6. Object Array: (Object is class)--- Object array is used to store different data types values
	  Object ob[]=new Object[6];
	  
	  ob[0]="Ahmad";
	  ob[1]= 25;
	  ob[2]= 15.5;
	  ob[3]= "2/2/2020";
	  ob[4]= 'F';
	  ob[5]= "Virginia";
	  
	  System.out.println(ob[3]);
	  
	  for(int t=0;t<ob.length;t++) {
		  System.out.println(ob[t]);
	  }

	}

}
