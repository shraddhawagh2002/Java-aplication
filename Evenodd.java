package nik.com;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Number");
		num=sc.nextInt();
		if(num%2==0)
		{
	      System.out.println("No is even");

		}
		else {
			System.out.println("No is odd");

		}
	}

}
