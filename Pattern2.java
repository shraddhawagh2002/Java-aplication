package day7.com;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int Row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows :");
		Row=sc.nextInt();
		System.out.println("Enter no of columns :");
		col=sc.nextInt();
		// TODO Auto-generated method stub
		for(int i=1;i<=Row;i++)
		{
			for(int j=col;j>=i;j--) {
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
