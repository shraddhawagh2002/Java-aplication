package day7.com;

import java.util.Scanner;

public class Factorsofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int no=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no :");
    no=sc.nextInt();
    
    if(no<=0)
    {
    	no=-no;
    }
    for(int i=1;i<=no;i++)
    {
    	if(no%i==0)
    	{
    		System.out.println(i);
    	}
    }
	}

}
