package day7.com;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
	    Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st Number");
		marks=sc.nextInt();
		
		
		if((marks>=90)&&(marks<=100))
		{
			System.out.println("Grade A");
		}
		else if((marks>=70)&&(marks<=89))
		{
			System.out.println("Grade B");
		}
		else if((marks>=50)&&(marks<=69))
		{
			System.out.println("Grade C");
		}
		else if((marks>=0)&&(marks<=49))
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
