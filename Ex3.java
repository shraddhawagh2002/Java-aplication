package day7.com;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Grade;
	    Scanner sc =new Scanner(System.in);
		System.out.println("enter grade");
		Grade=sc.next().charAt(0);		
		if((Grade=='A')||(Grade=='a'))
		{
			System.out.println("marks in between 90 to 100");
		}
		else if((Grade=='B')||(Grade=='b'))
		{
			System.out.println("marks in between 70 to 89");
		}
		else if((Grade=='C')||(Grade=='c'))
		{
			System.out.println("marks in between 50 to 69");
		}
		else if((Grade=='D')||(Grade=='d'))
		{
			System.out.println("marks in between 0 to 49");
		}
		else
		{
			System.out.println("Invalid Grade");
		}

	}

	

}
