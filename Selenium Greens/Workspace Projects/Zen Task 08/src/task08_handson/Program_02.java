//Create an if statement to find out if it's an even number.

package task08_handson;

import java.util.Scanner;

public class Program_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = sc.nextInt();
			
		if(a%2 == 0) {
			System.out.println("The entered integer "+ a +" is an even number");
		}
		else {
			System.out.println("The entered integer "+ a +" is not an even number");
		}
	}

}
