package day7.com;

import java.util.Scanner;

class CheckPrime {
	int no,count=0;
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		no = sc.nextInt();
	}
	
	void findFactor() {
		if(no<=0)
	    {
	    	no=-no;
	    }
	    for(int i=1;i<=no;i++)
	    {
	    	if(no%i==0)
	    		
	    	{
	    		count++;
	    	System.out.println(i);
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println("NO is prime");
	    }
	    else {
	    	System.out.println("NO is notprime");

	    }
		
	}
}
public class FactorPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime cobj = new CheckPrime();
    	cobj.input();
    	cobj.findFactor();
	}

}
