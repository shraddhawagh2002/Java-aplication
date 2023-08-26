package day7.com;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[];
		    boolean flag=false;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter size of array ele :");
		    int size=sc.nextInt();
		    arr=new int[size];
		    
		    if(size<2) {
		    	System.out.println("Invalid input");
		    	return;
		    }
		    int i;
		    System.out.println("Enter array eles :");
		    for( i=0;i<arr.length;i++)
		    {
		    	arr[i]=sc.nextInt();
		    }
		    System.out.println("Entered array eles are :");
		    for( i=0;i<arr.length;i++)
		    {
		    	System.out.println(arr[i]+" ");
		    }
		    System.out.println("sorted array ele are :");
		    //Arrays.sort(arr);
		    for(i=0;i<arr.length;i++)
		    {
		    for(int j=i+1;j<arr.length;j++)
		    {
		    int temp=0;
		    if(arr[i]>arr[j]){
		    temp=arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		    }
		    }
		    System.out.println("sorted ele are :"+arr[i]);
		    }
		    for(i=size-2;i>=0;i--) 
		    {
		    	if(arr[i]!=arr[size-1])
		    	{
		    		System.out.println("2nd Largest no is :"+arr[i]);
		    		return;
		    	}
		    }
	}

}
