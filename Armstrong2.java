package day7.com;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,sum=0;
		int i;
	    Scanner sc=new Scanner(System.in);
	    //System.out.println("enter no :");
	    //num=sc.nextInt();
	    
	    for(i=1;i<=1000;i++) {
	    num=i;
	    int orgno=num;
	    sum=0;
	    while(num>0) {
	    	digit=num%10;
	    	sum=sum+(digit*digit*digit);
	    	num=num/10;
	    	//System.out.println(num);
	    }
	    
	    if(sum==orgno) {
	    	System.out.println(orgno);
	    }
	    }
	    
	}

}
