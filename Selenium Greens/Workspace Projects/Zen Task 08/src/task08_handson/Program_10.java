//10. Write a program to Count Number of Digits in an Integer.

package task08_handson;

import java.util.Scanner;

public class Program_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int number = sc.nextInt();
		int count =0;
		
		while(number!=0) {
			number = number/10;
			count++;
			
		}
		System.out.println("The number of digits in the entered integer value is "+ count);
	}

}
