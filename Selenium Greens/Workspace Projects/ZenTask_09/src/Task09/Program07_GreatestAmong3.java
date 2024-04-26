package Task09;

import java.util.*;

public class Program07_GreatestAmong3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 number to find greatest among 3");
		
		System.out.println("A value");
		int A = sc.nextInt();
		System.out.println("B value");
		int B = sc.nextInt();
		System.out.println("C value");
		int C = sc.nextInt();
		
		//if statement for A value greater than B and C
		if(A>B && A>C) {
			System.out.println("The A value "+A+" is the greatest ");
		}
		
		//if statement for B value greater than A and C
		else if(B>A && B>C) {
			System.out.println("The B value "+B+" is the greatest ");
		}
		
		//if statement for C value greater than A and B
		else if(C>A && C>B) {
			System.out.println("The C value "+C+" is the greatest ");
		}
	}

}

/* Sample output
enter 3 number to find greatest among 3
A value
45
B value
353
C value
544534
The C value 544534 is the greatest 
*/
