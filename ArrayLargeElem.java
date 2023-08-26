package day7.com;

import java.util.Scanner;

public class ArrayLargeElem {

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
		 
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		   
		 }
		
	     System.out.println("Largest ele in an array is :"+max);
	}

}
