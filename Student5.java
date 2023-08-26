package day7.com;

public class Student5 {
	  
	    int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    Student5(int i,String n){  
	    id = i;  
	    name = n; 
	    age=23; // if we don't give default value it will take 0
	    } 
	    //creating three arg constructor  
	    Student5(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display()
	      {
	    	System.out.println(id+" "+name+" "+age);
	    	}  
	   
	    public static void main(String args[]){  
	    Student5 s1 = new Student5(111,"Karan");  
	    Student5 s2 = new Student5(222,"Aryan",25);  
	    //Student5 s1=new Student5();	
	   // Student5 s1=new Student5(1,"niks",11);	
	    s1.display();  
	    s2.display();  
	    
	   }  
	 
}
