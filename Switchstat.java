package day7.com;

import java.util.Scanner;

public class Switchstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int day;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day number :");
    day=sc.nextInt();
    
    switch(day){
        
    	case 1: System.out.println("Monday,1st day of the week");
    	break;
    	case 2: System.out.println("Tuesday,2nd day of the week");
    	break;
    	case 3: System.out.println("wednessday,3rd day of the week");
    	break;
    	case 4: System.out.println("Thursday,4th day of the week");
    	break;
    	case 5: System.out.println("Friday,5th day of the week");
    	break;
    	case 6: System.out.println("Saturday,6th day of the week");
    	break;
    	case 7: System.out.println("Sunday,7th day of the week");
    	break;
    	default:System.out.println("Invalid input");
    }
	}

}
