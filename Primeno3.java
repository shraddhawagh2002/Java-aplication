package day7.com;

public class Primeno3 {

	public static void main(String[] args) 
	{
		int cn=0,count=0;
		// TODO Auto-generated method stub
		for(int i=100;i>=1;i--) {
	       count=0;
	    	for(int j=1;j<=i;j++) {
	    		if(i%j==0) {
	    			count++;
	    		}
	    	}
	    	if(count==2)
	    	{
	    		cn++;
	    	System.out.print(" "+i);
	    	if(cn==3)
	    	{
	    		break;
	    }
	    }
		}
	
	}
}

