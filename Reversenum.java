package day7.com;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter number");
				num = sc.nextInt();
				
				String str = String.valueOf(num); //"572789"
				
				for(int i=str.length()-1;i>=0;i--) {
					System.out.print(str.charAt(i));
				}
			}

}
