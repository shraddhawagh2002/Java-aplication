package day7.com;



	
		// TODO Auto-generated method stub
		class Parent{
			   void add(){
			        System.out.println("add of parent");
			}
			}

			class Child extends Parent{
			 public void add(){
				 super.add();
			        System.out.println("add of Child");
			   }
			}
			public class Overridingex2 {
			public static void main(String[] args) {
				
				Child c1=new Child();
				
				c1.add();
				
				}
			
	

}
