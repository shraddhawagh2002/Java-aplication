package day7.com;

import java.util.Scanner;

public class FoundArrayElem {

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
    int searchele;
    System.out.println("Enter the search element :");
    searchele=sc.nextInt();
    for(int i=0;i<arr.length;i++)
    {
    	if(searchele==arr[i]) {
    		System.out.println("Element is present at position :"+i);
    		flag=true;
    		break;
    	}
    	
    }
    if(flag==false) {
      System.out.println("Element is not found");
     }
	}

}
