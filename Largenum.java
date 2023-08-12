package nik.com;

import java.util.Scanner;

public class Largenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Number");
		num1=sc.nextInt();
		System.out.println("enter Number");
		num2=sc.nextInt();
		if(num1>num2)
		{
	      System.out.println(+num1+ "is large" );

		}
		else {
			System.out.println(+num2+ "is large");

		}
	}
	}


