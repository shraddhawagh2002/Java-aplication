package day7.com;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int count=1,row,col;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows ");
    row=sc.nextInt();
    System.out.println("Enter no of columns ");
    col=sc.nextInt();
    
    for(int i=1;i<=row;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print(count+" ");
    		count++;
    	}
    	System.out.println();
    }
	}

}
