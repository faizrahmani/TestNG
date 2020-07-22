package BootCampPackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		/*int a=8;
		for(int i=1;i<=10;i++) {
			System.out.println(a + "x" + i + "=" + (a*i));
		}*/
		
		Scanner sc=new Scanner(System.in);
		
		int mult;
		{
			System.out.println("Enter a number to multiply:");
			mult=sc.nextInt();
		}
		for(int j=1;j<=10;j++) {
			System.out.println(mult+"X"+j+" "+"="+" "+(mult*j) );
		}
	}

}
