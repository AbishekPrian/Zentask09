//8. Write a program To print "Welcome to Guvi" 10 times.
package task08_handson;

import java.util.Scanner;

public class Program_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value as Welcome to Guvi");
		String a = sc.nextLine();
		
		System.out.println("Enter value to print n number of times ");
		int n = sc.nextInt();
		int count =0;
		
		for (int i=1;i<=n;i++)
		{
			count++;
			System.out.println(a);
		}
		System.out.println("Total count is "+count);
	}

}
