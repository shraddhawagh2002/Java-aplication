package day7.com;

import java.util.Scanner;

public class ArrayReverse {

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
		 System.out.println("entered ele are :");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println("reverse ele are :");
		 for(int i=arr.length-1;i>=0;i--) {
			 System.out.println(arr[i]);
	}
	}


}

