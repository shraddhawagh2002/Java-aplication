package day7.com;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num,digit,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no :");
    num=sc.nextInt();
    
    int orgno=num;
    
    while(num>0) {
    	digit=num%10;
    	sum=sum+(digit*digit*digit);
    	num=num/10;
    }
    if(sum==orgno) {
    	System.out.println("no is Armstrong ");
    }
    else {
    	System.out.println("num is not  Armstrong ");

    }
	}

}
