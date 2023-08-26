package day7.com;

import java.util.Scanner;

public class SumofSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0.0,fact=1;
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter N value :");
     n=sc.nextInt();
     for(int i=1;i<n;i++) {
    	 fact=fact*i;
    	 sum=sum+(1/(fact)i);
     }
     System.out.println("sum = "+sum);
	}

}
