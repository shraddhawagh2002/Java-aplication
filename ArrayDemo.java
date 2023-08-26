package day7.com;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* int rollno[]=new int[5];
    rollno[0]=10;
    rollno[1]=11;
    rollno[2]=12;
    rollno[3]=13;
    rollno[4]=14;
    
    System.out.println("First ele="+rollno[0]);
    System.out.println("2nd ele="+rollno[1]);
    System.out.println("3rd ele="+rollno[2]);
    System.out.println("4th ele="+rollno[3]);
    System.out.println("5th ele="+rollno[4]);*/
		
		 int arr[]=new int[5];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter array ele :" +arr.length);
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("enter ele :");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
