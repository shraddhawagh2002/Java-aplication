package day7.com;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "EDUBRIDGE";
		
		for(int i=0; i<s1.length(); i++)
			System.out.println(s1.substring(0, i+1));

		for(int i=s1.length()-1; i>=0; i--)
			System.out.println(s1.substring(0, i));

    }
    
	
}

