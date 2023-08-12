package day7.com;

import java.util.Scanner;

public class CalculateDis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String pname;
     float pprice,dis,amount;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name");
     pname=sc.next();
     System.out.println("Enter price");
     pprice=sc.nextInt();
     
     if(pprice>0 && pprice<=10000)
     {
    	dis=(pprice*0.05f);
    	
     }
     else if(pprice>10000 && pprice<=20000)
     {
    	dis=(pprice*0.1f);
    	
     }
     else if(pprice>20000 && pprice<=35000)
     {
    	dis=(pprice*0.15f);
    	
     }
     else
     {
    	 dis=(pprice*0.2f);
    	 
     }
     amount=pprice-dis;
     System.out.println("Enter product name :"+pname);
     System.out.println("Enter product price :"+pprice);
     System.out.println("Enter product discount :"+dis);
     System.out.println("Enter product amount :"+amount);

     }

}
