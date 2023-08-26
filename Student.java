package day7.com;

import java.util.Scanner;

public class Student {
	
		 int age;
		 String name;
		void input(){
		     Scanner sc=new Scanner(System.in);
		    
		     System.out.println("Enter student name");
		     name = sc.nextLine();
		     
		     System.out.println("Enter age");
		     age = sc.nextInt();
		  }
		  void display(){
		      System.out.println("Name ="+name);
		       System.out.println("Age="+age);
		  }
		public static void main(String args[]){
		   Student sob=new Student();
		     sob.input();
		     sob.display(); 
		  Student sob1=new Student();
		     sob1.input();
		     sob1.display(); 
		  
		
		}
}
