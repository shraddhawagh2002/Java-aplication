package shr.com;

import java.util.Scanner;

public class Example1 {
public static void main() {
	int age;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your age");
	age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("Eligible for votting");
	}
	else
	{
		System.out.println("Not Eligible for votting");
	}
	
}
}
