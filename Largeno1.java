package shr.com;

import java.util.Scanner;

public class Largeno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,l,l1,l2;
		Scanner sc = new Scanner(System.in);
		System.out.println("first no :");
		a=sc.nextInt();
		System.out.println("second no :");
		b=sc.nextInt();
		System.out.println("third no :");
		c=sc.nextInt();
		System.out.println("fourth no :");
		d=sc.nextInt();
		
        l=(a>b)?a:b;
		
		System.out.println("the largest no is :"+l);
		
		
		l1=(a>b && a>c)?a:(b>a && b>c)?b:c;
		
		System.out.println("the largest no is :"+l1);
		
        l2=(a>b && a>c)?a:(b>a && b>c)?b:(d>a && d>c)?d:c;
		
		System.out.println("the largest no is :"+l2);
	}
	}


