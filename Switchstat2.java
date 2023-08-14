package day7.com;

import java.util.Scanner;

public class Switchstat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter character :");
	    ch=sc.next().charAt(0);
	    
	    switch(ch){
	    case 'A':System.out.println("entered charachter is vowel");
	    break;
	    case 'a':System.out.println("entered charachter is vowel");
	    break;
	    case 'E':System.out.println("entered charachter is vowel");
	    break;
	    case 'e':System.out.println("entered charachter is vowel");
	    break;
	    case 'I':System.out.println("entered charachter is vowel");
	    break;
	    case 'i':System.out.println("entered charachter is vowel");
	    break;
	    case 'O':System.out.println("entered charachter is vowel");
	    break;
	    case 'o':System.out.println("entered charachter is vowel");
	    break;
	    case 'U':System.out.println("entered charachter is vowel");
	    break;
	    case 'u':System.out.println("entered charachter is vowel");
	    break;
	    default : System.out.println("not vowel");
	    }
	}

}
