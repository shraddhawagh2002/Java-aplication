package day7.com;

import java.util.Scanner;

public class FirstLettersInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		
		/*char c[]= str.toCharArray();
		for (int i=0; i < c.length; i++) {
	         // Logic to implement first character of each word in a string
	     if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
	      System.out.print(c[i]);
	         }*/
		
		  String str2=" ";
		  str2=str2+str.charAt(0)+".";
		  for(int i=0;i<str.length();i++) {
			  if(str.charAt(i)==' ')
			  {
				  str2=str2+str.charAt(i+1)+".";
				  
			  }
			  System.out.println(str2);
	      }
	}

}
