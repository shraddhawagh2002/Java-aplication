package shr.com;

public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=342;
      int Rev=num%10;
      System.out.print(Rev);
      Rev=num/10;
      Rev=Rev%10;
      System.out.print(Rev);
      Rev=num/10;
      Rev=Rev/10;
      System.out.print(Rev);
	}

}
