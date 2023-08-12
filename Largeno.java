package com.shra;

import java.util.Scanner;

public class Largeno {
	public static void main() {
		int a,b,c,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("first no :");
		a=sc.nextInt();
		System.out.println("second no :");
		b=sc.nextInt();
		System.out.println("third no :");
		c=sc.nextInt();
		
		l=(a>b && a>c)?a:(b>a && b>c)?b:c;
		
		System.out.println("the largest no is :"+l);
	}

}
