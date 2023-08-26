package day7.com;

import java.util.Scanner;

public class ArrayMinElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of an array :");
    int size=sc.nextInt();
    arr=new int[size];
    
    System.out.println("Enter array eles :");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]<min)
    	{
    		min=arr[i];
    	}
    }
    System.out.println("minimum ele in an array is :"+min);
	}

}
