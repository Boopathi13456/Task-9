import java.util.Scanner;

public class Hotel {
   public static void main(String[] args) {
		
		int month,days;
		float rent;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month: ");
		month = sc.nextInt();
		System.out.print("How many Days: ");
		days=sc.nextInt();
		System.out.print("rent of the Room: ");
		rent=sc.nextFloat();
						
				
		switch(month)
		{
		case 1,2,3,7,8,9,10:
			
		float total=days*rent;
		System.out.println();
		System.out.print("Total rent: ");
		System.out.format("%.2f",total );
		break;
		
		case 4,5,6,11,12:
		
		float total1=days*rent;
		//System.out.println("total rent: " +total);
		
		float hikedays=(total1/100) * 20;		
		//System.out.println("seasonal revised rent:" +hikedays);
		
		hikedays=total1+hikedays;
		System.out.println();
		System.out.println("Seasonal Revised Rent:");
		System.out.format("%.2f",hikedays);
		break;
		}
	} 
}

/*
 Output
 Enter the Month: 1
 How many Days: 6
 rent of the Room: 3300

 Total rent: 19800.00

 Enter the Month: 12
 How many Days:6
 rent of the Room: 3300

 Seasonal Revised Rent: 
 23760.00
 */
