package day7.com;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num;
    int rev=0;
    int digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no :");
    num=sc.nextInt();
    int a=num;
    
    while(num>0)
    {
    	digit=num%10;
    	rev=rev*10+digit;
    	num=num/10;
    }
    
    System.out.println("reverse is :"+rev);
    if(rev==a) {
    	System.out.println("the given no is Palindrome");
    }
    else {
    	System.out.println("the given no is not palindrome");
    }
	}

}
