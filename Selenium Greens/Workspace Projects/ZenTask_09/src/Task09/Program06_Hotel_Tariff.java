package Task09;

import java.text.DecimalFormat;
import java.util.*;

public class Program06_Hotel_Tariff {

	public static void main(String[] args) {
		//Initializing the variables
		int month;
		float rent,regular,peak, days;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the month of booking: ");
		month=sc.nextInt();
		
		
		
		System.out.println("Enter the room rent: ");
		rent=sc.nextFloat();
		
		System.out.println("Enter the total number of days stay: ");
		days=sc.nextFloat();
		
		
		//The hotel tariff calculation on regular days
		regular=rent*days;
		
		//The hotel tariff calculation on peak season 20% hike
		peak=(float)((rent+(rent*0.2))*days);
		
		
		//The requirement is to display output with 2 decimal places  
		DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(2);
	    df.setMaximumFractionDigits(2);
		
	    
		switch(month) {
		//If month is 1 regular tariff is calculated
		case 1:
			System.out.printf("The hotel tariff to be paid is : " +  df.format(regular));
			break;
		//If month is 2 regular tariff is calculated
		case 2:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 3 regular tariff is calculated
		case 3:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 4 regular tariff is calculated
		case 4:
			System.out.println("The hotel tariff to be paid is : " + df.format(peak));
			break;
		//If month is 5 regular tariff is calculated
		case 5:
			System.out.println("The hotel tariff to be paid is : " + df.format(peak));
		break;
		//If month is 6 regular tariff is calculated
		case 6:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 7 regular tariff is calculated
		case 7:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 8 regular tariff is calculated
		case 8:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 9 regular tariff is calculated
		case 9:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 10 regular tariff is calculated
		case 10:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 11 regular tariff is calculated
		case 11:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//If month is 12 regular tariff is calculated
		case 12:
			System.out.println("The hotel tariff to be paid is : " + df.format(regular));
			break;
		//By default invalid input if month is > 12
		default:
			System.out.println("Invalid input");

}
}

}

/* sample output

Enter the month of booking: 
12
Enter the room rent: 
3432.45
Enter the total number of days stay: 
4
The hotel tariff to be paid is : 13,729.80

*/
