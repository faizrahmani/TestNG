package OOPs2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {


		//In ArrayList without giving limition we can add any data type value
		
		ArrayList ar=new ArrayList();
		
		ar.add(200);  //0
		ar.add(400);  //1
		ar.add(500);  //2
		
		System.out.println(ar.size());
		
		ar.add(10);  //3
		ar.add(20);  //4
		
		System.out.println(ar.size());
		
		ar.add("Hi");     //5
		ar.add("Ahmad");  //6
		ar.add(33.22);    //7
		ar.add('F');      //8
		ar.add("2/2/2020");//9
		
		System.out.println(ar.size());
		ar.remove(9); //This method will remove last object, as we have given 9 index
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));  // 5 is printing 6th value of the arraylist. 
		
		System.out.println(ar.size());
		
		
		//To print all the values of ArrayList, we use for loop. 
		for(int i=0;i<ar.size();i++) {
		
		System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(300);
		//ar1.add("Ahmad"); It is not allowed, because we limited it to integers only
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Ahmad");
		
		ArrayList<Double> ar3=new ArrayList<Double>();
		ar.add(44.44);

	}

}
