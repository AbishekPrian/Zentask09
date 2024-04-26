package Task09;
import java.util.Scanner;


public class Program01_Palindrome {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a string");
				
				//Getting user input
				String text = sc.nextLine();
				System.out.println("The entered string is " +text);
				
				String rev = "";
				int len = text.length();
				
				//Reverse the string using for loop
				for (int i = len-1;i>=0;i--) {
					rev = rev+text.charAt(i);
				}
				System.out.println("\nThe reversed string is " +rev);
				
				//Checking if the string is palindrome or not
				if(text.contentEquals(rev)) {
					System.out.println("The given string is palindrome");
				}
				else  {
					System.out.println("The given string is not a palindrome");
				}
			}

		}
		
		/*input: Malayalam
		Output: The given string is palindrome

		input: Test
		Output: The given string is not a palindrome
		*/
