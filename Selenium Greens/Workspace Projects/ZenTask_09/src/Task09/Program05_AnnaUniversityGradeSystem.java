package Task09;

import java.util.*;

public class Program05_AnnaUniversityGradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sudent mark to find the grade");
		double marks=sc.nextDouble();
		
		// loop for invalid marks input
		while(marks>100 || marks<0) {
			System.out.println("Invalid input");
			break;
		}
		
		int grade_score = (int) (marks/10); //getting the quotient of marks divided by 10
		
		switch(grade_score) {
		case 10: //marks=100
			System.out.println("The mark is 100, Please find the grade below");
			System.out.println("S");
			break;
		case 9: // marks between 90-99
			System.out.println("The mark is in between 90-99, Please find the corresponding grade below");
			System.out.println("A");
			break;
		case 8: // marks between 80-89
			System.out.println("The mark is in between 80-89, Please find the corresponding grade below");
			System.out.println("B");
			break;
		case 7: // marks between 70-79
			System.out.println("The mark is in between 70-79, Please find the corresponding grade below");
			System.out.println("C");
			break;
		case 6: // marks between 60-69
			System.out.println("The mark is in between 60-69, Please find the corresponding grade below");
			System.out.println("D");
			break;
		case 5: // marks between 50-59
			System.out.println("The mark is in between 50-59, Please find the corresponding grade below");
			System.out.println("E");
			break;
		case 4: case 3: case 2: case 1: case 0: // marks between < 50
			System.out.println("The mark is below 50, Please find the corresponding grade below");
			System.out.println("F");
			break;
		default: //
		}
		
		
	}

}

/* Output
enter the student mark to find the grade
55
The mark is in between 50-59, Please find the corresponding grade below
E

 */
