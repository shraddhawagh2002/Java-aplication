package day7.com;

import java.util.Scanner;

public class ArraySum{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size of an aray :");
		 int size=sc.nextInt();
		 arr=new int[size];
		 
		 System.out.println("enter the ele  :");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("entered array eles are :");
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.print(" "+arr[i]); 
		 }
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
		   
		 }
		 System.out.println();
		 System.out.println("addition is :"+sum);
	}

}
