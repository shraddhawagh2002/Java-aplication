package day7.com;

import java.util.Scanner;

class FactorMain {
	int no;
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
	    		System.out.println(i);
	    	}
	    }
		
	}
}
public class Factoofno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorMain fobj = new FactorMain();
    	fobj.input();
    	fobj.findFactor();
	}

}
