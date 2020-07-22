package BootCampPackage;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		/*int number=7;
		if(number%2==0) {
			System.out.println("The number is even");
		}
		else
			System.out.println("The number is odd"); */
		
		Scanner sc=new Scanner(System.in);
		
		int number;
		 {
			System.out.println("Enter number");
			number=sc.nextInt();
		}
		 if(number%2==0) {
			 
			 System.out.println("The number is even");
		 }
		 else {
			 System.out.println("The number is Odd");
		 }
		
	}

}
