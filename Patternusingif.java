package day7.com;

import java.util.Scanner;

public class Patternusingif {
	void triangle(int num){
		for(int i=1;i<=num;i++)
        {
            for(int j=num;j>0;j--)
            {
              if(j>i)
              {
            	  System.out.print(" ");
              }
              else
              {
            	  System.out.print(i+" ");
              }
            }
            System.out.println();
        }    
//		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner sc =new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		Patternusingif task=new Patternusingif();
		task.triangle(num1);
		task.triangle(num2);
		task.triangle(num3);
	}

}
