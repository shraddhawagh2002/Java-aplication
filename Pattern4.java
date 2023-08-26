package day7.com;

import java.lang.*;
import java.util.Scanner;

 class Reverse{
	void triangle(int rc) {
		
		for(int i=rc;i>0;i--)
		{
			for(int j=rc-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" "+i);
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st input :");
		no1=sc.nextInt();
		System.out.println("Enter 2nd input :");
		no2=sc.nextInt();
		System.out.println("Enter 3rd input :");
		no3=sc.nextInt();
		
		Reverse R1 = new Reverse();
		R1.triangle(no1);
		R1.triangle(no2);
		R1.triangle(no3);
	}

}
