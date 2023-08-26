package day7.com;

import java.util.Scanner;

public class FoundArrayElem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[];
		    boolean flag=false;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter size of array ele :");
		    int size=sc.nextInt();
		    arr=new int[size];
		    
		    System.out.println("Enter array eles :");
		    for(int i=0;i<arr.length;i++)
		    {
		    	arr[i]=sc.nextInt();
		    }
		    System.out.println("Entered array eles are :");
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.println(arr[i]+" ");
		    }
		    System.out.println("Enter search ele :");
		    int Searchno = sc.nextInt();
		    int count=0;
		    for(int i=0;i<arr.length;i++) {
		    	if(arr[i]==Searchno) {
		    		count++;
		    	}
		    }
		    if(count>0)
		    {
		    	System.out.println("ele is present ");
		    }
		    else {
		    	System.out.println("ele is not present ");
		    }
	}

}
