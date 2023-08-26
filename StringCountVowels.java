package day7.com;

import java.util.Scanner;

public class StringCountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String s=sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		if(c == 'A' || c == 'E' || c == 'I' || c == '0' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
		count++;
		}
		}
		System.out.print(count);
	}

}
