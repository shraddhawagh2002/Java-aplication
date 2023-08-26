package day7.com;

import java.util.Scanner;

public class CheckUsernamePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validUsername = "shraddha";
	    String validPassword = "wagh@123";
		String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals(validUsername) && password.equals(validPassword))
        {
            System.out.println("username password is correct ");
        }
        else
        {
            System.out.println("incorrect info");
        }
	}

}
