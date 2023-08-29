package nik.com;

public class ExceptionhandlingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2,c=0;
	    int ar[]=new int[4];
	    System.out.println("Before division");
	    try {
	    c = a/b;
	    System.out.println("After division "+c);	    
	    }
	    catch(ArithmeticException e) 
	    {
	    	System.out.println(e);
	    	e.printStackTrace();
			System.out.println("catch block execute if there is any error");

	   
	    }
	   finally
	   {
		   System.out.println("finally execute");
	   } 
	}

}
