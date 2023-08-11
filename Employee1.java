import java.lang.*;
import java.util.*;
class Employee {
	 
	  String empname;
          int empsal;
	  int empage;
	void inputempData()
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter name");
          empname=sc.next();
          System.out.println("enter sal");
          empsal=sc.nextInt();
          System.out.println("enter age");
          empage=sc.nextInt();
          
        }  
    
	  void displayempDetails(){
	     System.out.println("employee name="+empname);
             System.out.println("employee salary ="+empsal);
	     System.out.println("employee age ="+empage);
	   }
 
public String toString(){
return"Employee[empname="+empname+",empsal="+empsal+",empage="+empage+"]";
}
}
public class Employee1 {
	public static void main(String args[]){
        System.out.println("Main");
       
        Employee eob = new Employee();
         eob.inputempData();
         eob.displayempDetails();
         System.out.println(eob);

        Employee eob1= new Employee();
         eob1.inputempData();
         eob1.displayempDetails();
         System.out.println(eob1);
    }
}
