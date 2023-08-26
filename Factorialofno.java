package day7.com;

import java.util.Scanner;

public class Factorialofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i;
    long fact=1;  
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no to find factorial :");	
    number=sc.nextInt();
	for(i=1;i<=number;i++){    
		fact=fact*i;    
	 }    
	   System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
}
