package day7.com;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no og rows ");
    row=sc.nextInt();
    System.out.println("Enter no of columns ");
    col=sc.nextInt();
    
    for(int i=1;i<=row;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j+" ");
    	}
    	System.out.println();
    }
	}

}
