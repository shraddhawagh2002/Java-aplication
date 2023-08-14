package day7.com;

import java.util.Scanner;

public class Switchstat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter character :");
	    ch=sc.next().charAt(0);
	    
	    switch(ch){
	    case 'A':
	    case 'a':
	    case 'E':
	    case 'e':
	    case 'I':
	    case 'i':	    
	    case 'O':	   
	    case 'o':	   
	    case 'U':	    
	    case 'u':System.out.println("entered charachter is vowel");
	    break;
	    default : System.out.println("not vowel");
	    }
	

	}

}
