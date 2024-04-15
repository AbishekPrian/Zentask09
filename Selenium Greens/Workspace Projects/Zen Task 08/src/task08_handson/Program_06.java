//6. Write a program to print the factorial of a given number.
package task08_handson;

import java.util.Scanner;

public class Program_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print its factorial");
		int a = sc.nextInt();
		int fact = 1;
		
		for(int i=1; i<=a;i++) {
			fact = fact*i;
		}
		System.out.println("the factorial of a given number is "+ fact);
	}

}
