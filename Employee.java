package com.shra;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eid;
		String ename;
		float esal;
		int eage;
		char egender;
		String dept;
		
     Scanner sc = new Scanner(System.in);
     System.out.println("enter employee id");
     eid = sc.nextInt();
     System.out.println("enter employee name");
     ename = sc.next();
     System.out.println("enter employee salary");
     esal = sc.nextFloat();
     System.out.println("enter employee age");
     eage = sc.nextInt();
     System.out.println("enter employee gender");
     egender = sc.next().charAt(0);
     System.out.println("enter employee department");
     dept = sc.next();
     
     System.out.println("employee id " +eid);
     System.out.println("employee name "+ename);
     System.out.println("employee salary "+esal);
     System.out.println("employee age "+eage);
     System.out.println("employee gender "+egender);
     System.out.println("employee department "+dept);

	}

}
