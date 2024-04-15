//7. Write a program to print the length of the given string.

package task08_handson;

import java.util.Scanner;

public class Program_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to find its length");
		String text = sc.nextLine();
		
		/*
		 * Using length method 
		 * int len = text.length();
		 * System.out.println("The length of the string is "+len);
		 */
		
		int len = 0;
		for(int i=0;i<=text.length()-1;i++)
		{
			len++;
		}
		System.out.println("The length of the string is "+len);
		
	}

}
