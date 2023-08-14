package day7.com;

import java.util.Scanner;

public class Switchstat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char op;
    int num1,num2,Result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an operator :");
    op=sc.next().charAt(0);
    System.out.println("Enter 1st number :");
    num1=sc.nextInt();
    System.out.println("Enter 2nd number :");
    num2=sc.nextInt();
    switch(op) {
    case '+' :
    	Result=num1+num2;
    	System.out.println(num1+" + "+num2+" = "+Result);
    break;
    case '-' :
    	Result=num1-num2;
    	System.out.println(num1+" - "+num2+" = "+Result);
    	break;
    case '*' :
    	Result=num1*num2;
    	System.out.println(num1+" * "+num2+" = "+Result);
    	break;
    case '/' :
    	if(num2 !=0)
    	{  Result=num1/num2;
    	   System.out.println(num1+" / "+num2+" = "+Result);
    	
        }
    	else {
    		System.out.println("can't divide by zero");
    	}
    	
    	break;
    
    default:System.out.println("invalid input");
    
    }
	}

}
