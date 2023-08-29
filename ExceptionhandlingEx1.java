package nik.com;

public class ExceptionhandlingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10,b=0,c=0;
    int ar[]=new int[4];
    System.out.println("Before division");
    try {
    c = a/b;
    }catch(ArithmeticException e) {
    System.out.println(e);}
    System.out.println("After division " +c);
    
    try {
    	ar[4]=45;
    }catch(ArrayIndexOutOfBoundsException e) {
    	//System.out.println(e);
    	e.printStackTrace();
    }
	}

}
