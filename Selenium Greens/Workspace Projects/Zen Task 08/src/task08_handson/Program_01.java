//Write a Java program that declares four integer variables: a, b, c, and d. Then, write an if statement that checks 
//whether the sum of a and b is greater than the sum of c and d. If the condition is true, 
//the program should output a message indicating that the sum of a and b is greater than the sum of c and d.


package task08_handson;
import java.util.Scanner;
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a = sc.nextInt();
		
		System.out.println("Enter B value");
		int b = sc.nextInt();
		
		System.out.println("Enter C value");
		int c = sc.nextInt();
		
		System.out.println("Enter D value");
		int d = sc.nextInt();
		
		if((a+b)>(c+d)) {
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
		else {
			System.out.println("The sum of a and b is not greater than the sum of c and d");
		}
	}

}
