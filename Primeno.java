package day7.com;

import java.util.Scanner;

		// TODO Auto-generated method stub
		class primeMain {
			int no,count=0;
			void input() {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number");
				no = sc.nextInt();
			}
			
			void findprime() {
				if(no<=0)
			    {
			    	no=-no;
			    }
			    for(int i=1;i<=no/2;i++)
			    {
			    	if(no%i==0)
			    	{
			    		System.out.println("no is prime");
			    	}
			    	else {
			    		System.out.println("no is notprime");

			    	}
			    }
				
			}

}
	public class Primeno {

			public static void main(String[] args) {
				primeMain pobj=new primeMain();
				pobj.input();
				pobj.findprime();
			}
	}
			
