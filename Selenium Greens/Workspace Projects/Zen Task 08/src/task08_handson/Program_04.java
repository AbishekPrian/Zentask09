//Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
//You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console.

package task08_handson;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A value");
		int a = sc.nextInt();
		
		System.out.println("enter B value");
		int b = sc.nextInt();
		
		int c = a;
		 a = b;
		 b = c;
		 
		 System.out.println("The value of a is "+ a + "\n"+ "The value of b is "+ b );
	
		
	}

}
