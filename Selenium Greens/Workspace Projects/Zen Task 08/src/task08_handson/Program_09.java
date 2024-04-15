//9. Write a program to check whether the person is a senior citizen or not.
package task08_handson;

import java.util.Scanner;

public class Program_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person's age");
		int age = sc.nextInt();
		
		if (age>=60) {
			System.out.println("The person is a senior citizen");
		}
		else{
			System.out.println("The person is not a senior citizen");
		}
	}

}
