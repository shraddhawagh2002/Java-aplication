package com.shra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
      int sid;
      String sname;
      float sfees;
      
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new  BufferedReader(is);
      
      System.out.println("enter student id");
      sid = Integer.parseInt(br.readLine());     
      System.out.println("Enter name");
	  sname=br.readLine();		 
	  System.out.println("Enter fees");
	  sfees = Float.parseFloat(br.readLine());		 
	  System.out.println("Student Id="+sid);
	  System.out.println("Student Name="+sname);
	  System.out.println("Student Fees="+sfees);
		 
		 
	}

}
