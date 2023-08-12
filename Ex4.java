package day7.com;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int unit;
    float bill;
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter unit");
    unit=sc.nextInt();
    System.out.println("Enter your name");
    name=sc.next();
    
    if(unit>=0 && unit<=200)
    {
    	bill=unit*3.80f;
     
    }
    else if((unit>200)&&(unit<=300))
    {
    	bill=200*3.80f+(unit%200)*4.40f;
     
    }
    else if((unit>300)&&(unit<=400))
    {
    	bill=200*3.80f+300*4.40f+(unit%300)*5.10f;
     
    }
    else
    {
    	bill=200*3.80f+300*4.40f+400*5.10f+(unit%400)*5.80f;
    	
    }
    System.out.println("customer name :"+name);
    System.out.println("units consumed "+unit);
    System.out.println("your electricity bill is "+bill);
	}

}
