package day7.com;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0.0;
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter N value :");
     n=sc.nextInt();
     
     for(int i=1;i<n;i++) {
    	 sum=sum+(1/(double)i);
     }
     System.out.println("sum = "+sum);
	}

}
