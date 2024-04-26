package Task09;
import java.util.Scanner;
public class Program03_NumericPattern {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		//Getting user input row number
		System.out.println("enter row number to print number pattern");
		int num = sc.nextInt();
		System.out.println();
		
		int s=1;
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(s+" ");	
				s++;
			}
			System.out.println();
	}

}
}

/*  sample output
enter row number to print number pattern
5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
   */

