package com.shra;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int length,breadth,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter breadth");
        breadth = sc.nextInt();
        
         area = length * breadth;
        System.out.println("area is "+area);
        
	}

}
