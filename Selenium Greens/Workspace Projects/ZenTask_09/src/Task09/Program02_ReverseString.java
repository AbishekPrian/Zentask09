package Task09;
import java.util.Scanner;

public class Program02_ReverseString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		//Getting user input string
		System.out.println("enter a string");
		String text = sc.nextLine();
	
		int len = text.length();
		String rev =""; 
		
		//Reverse the string using for loop
		for(int i=len-1;i>=0;i--) {
			rev = rev+text.charAt(i);
			
		}
		System.out.println ("The reversed string is "+rev);
	}

}


/* Sample output
 enter a string
test string
The reversed string is gnirts tset
*/
