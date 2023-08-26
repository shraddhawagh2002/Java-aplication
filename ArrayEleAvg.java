package day7.com;

import java.util.Scanner;

public class ArrayEleAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array eles :");
    int size=sc.nextInt();
    arr=new int[size];
    
    System.out.println("enter array eles :");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    System.out.println("array eles are :");
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
    int sum=0;
    int avg=0;
    for(int i=0;i<arr.length;i++)
    {
    	sum=sum+arr[i];
    	avg=sum/arr.length;
    }
    System.out.println("Average of an array eles is :"+avg);
	}
   
}
