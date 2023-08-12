package day7.com;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a ,b ,c;
    Scanner sc =new Scanner(System.in);
	System.out.println("enter 1st Number");
	a=sc.nextInt();
	
	System.out.println("enter 2nd  Number");
	b=sc.nextInt();
	
	System.out.println("enter 3rd Number");
	c=sc.nextInt();
	
	if(a>b && a>c){
		System.out.println("the largest no is"+a);
	}
		else if(b>a && b>c)
		{
		System.out.println("the largest no is"+b);
		}
		else
		{
			System.out.println("the largest no is"+c);
		}
	}
	

}
