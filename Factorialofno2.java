package day7.com;

import java.util.Scanner;

class Example1{
	int n;
	long fact=1;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to find factorial : ");
		n=sc.nextInt();
	}
	void factorialno() {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of " +n+ " is :"+fact);
	}
}
public class Factorialofno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 eobj=new Example1();
		eobj.input();
		eobj.factorialno();
	}

}
