package day7.com;
//Function overloading example
class Addition{
	void add(int i,int j) {
		int s=i+j;
		System.out.println("Int Addition is :"+s);
	}
	void add(short i,short j) {
		short s=(short) (i+j);
		System.out.println("short Addition is :"+s);

	}
	void add(long i,long j) {
		long s=i+j;
		System.out.println("long Addition is :"+s);

	}
	void add(byte i,byte j) {
		byte s=(byte) (i+j);
		System.out.println("byte Addition is :"+s);

	}
	void add(float i,float j) {
		float s=i+j;
		System.out.println("float Addition is :"+s);

	}
	void add(double i,double j) {
		double s=i+j;
		System.out.println("double Addition is :"+s);

	}
	
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Addition a1=new Addition();
   a1.add(45, 78);
   a1.add((short)4,(short)9);
   a1.add(45l, 78l);
   a1.add((byte)2, (byte)6);
   a1.add(45.3f, 78.8f);
   a1.add(45.9, 78.5);
	}

}
