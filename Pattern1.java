package day7.com;
import java.lang.*;
import java.util.Scanner;

 class Shraddha{
	void triangle(int rc) {
		
		for(int i=1;i<=rc;i++)
		{
			for(int j=rc;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
public class Pattern1 {
public static void main(String args[]) {
	int no1,no2,no3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st input :");
	no1=sc.nextInt();
	System.out.println("Enter 2nd input :");
	no2=sc.nextInt();
	System.out.println("Enter 3rd input :");
	no3=sc.nextInt();
	
	Shraddha e1 =new Shraddha();
	e1.triangle(no1);
	e1.triangle(no2);
	e1.triangle(no3);
}
}
