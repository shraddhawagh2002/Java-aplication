package com.shra;
class Student1 {
	  int studentid;
	  String studentname;
	  int studentage;
	  
	  void displayStudentDetails(){
	     System.out.println("Student id ="+studentid);
	     System.out.println("Student name="+studentname);
	     System.out.println("Student age ="+studentage);
	   }
public class Encp1 {
	public static void main(String args[]){
        System.out.println("Main");
       
        Student1 sob = new Student1();
         sob.displayStudentDetails();
    }
}
}
