package nik.com;

import java.util.Scanner;
public class MinMaxarray {
	
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	        System.out.println("Enter array length :");
	        int n=sc.nextInt();
	        int[] a = new int[n];  
	        System.out.println("Enter the elements of the array: ");  
	        for(int i=0; i<n; i++)  
	        {  
	   
	           a[i]=sc.nextInt();  
	           
	         }  
	        int max=a[0];
	    	int min=a[0];
	        
	        for(int i=1;i<a.length;i++)
	        {
	        	if(a[i]>max) {
	        		max=a[i];
	        	}
	        	if(a[i]<min)
	        	{
		        	min=a[i];
		        }

	        }
	        System.out.println("max array ele is :"+max);
	        System.out.println("min array ele is :"+min);

	    }   
	    
}
