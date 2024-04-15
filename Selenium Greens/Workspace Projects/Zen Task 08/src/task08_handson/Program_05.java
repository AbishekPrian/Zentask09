//5. Write a program to check if a number is prime or not.
package task08_handson;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check if it is a prime number");
		int a = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=a;i++) {
			if(a%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("The number "+a+" is a prime number");
		}
		else {
			System.out.println("The number "+a+" is not a prime number");

		}
	}
}