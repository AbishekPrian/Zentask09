package Task09;
import java.util.Scanner;


public class Program04_Star_Pattern {

	public static void main(String[] args) {

		int row=5;
		for(int i=1;i<=row;i++) {
			if (i==1) {
				System.out.println("*   *");
			}
			if(i==2) {
				System.out.println(" * * ");
			}
			if(i==3) {
				System.out.println("  *");
			}
			
			if(i==4) {
				System.out.println(" * * ");
			}
			if (i==5) {
				System.out.println("*   *");
			}
			}

	}
}



/*
Sample output
*   *
 * * 
  *
 * * 
*   *

*/   

