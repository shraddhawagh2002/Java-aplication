package nik.com;

import java.util.Scanner;

public class Divisibleby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Number");
		num=sc.nextInt();
		if(num % 3==0 && num % 5 ==0)
		{
	      System.out.println(+num+"no is divisible by 3 & 5" );

		}
		else {
			System.out.println(+num+"no is not divisible by 3 & 5");

		}
		
	}

}
