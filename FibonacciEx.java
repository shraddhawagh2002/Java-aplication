package day7.com;

import java.util.Scanner;

public class FibonacciEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=0,n2=1,n3,i,count; 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of count that you want fibonacci series :");
		 count=sc.nextInt();
		 System.out.println("Fibonacci series is :");
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3); // 0   1   2  
		  n1=n2;                   //  n1  n2  n3
		  n2=n3;    
		 }    
	}

}
