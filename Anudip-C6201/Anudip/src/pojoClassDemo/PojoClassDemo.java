package pojoClassDemo;
/*class has two  type=1)Predefined class 2)user defined class
 * 
 * 1/)these classes have been already created by java creator.
 * Scanner,String,System
 * 2)user define =It has two type=1)compilable class and executed class 
 * 1/)compilable class=it isn't contain main method.
 * 2)executed class=It has a main method.
 */

/*this keyword= it is represent current class object.Meaning we are representing the object of the class in which we are writing this keyword.
 * private variable can't access in the other class therefore we are  using constructor and setter nethod
 * 
 * 
 * 
 * setter:
 * syntax:
 * public void setvariable(String variable){
 * this.varible=variable;
 * }
 * 
 * if we don't have all detail to be stored in object,then we can call setter of only those variable whose data we have.
 * Create a pojo class for student.
 * Make object for three different student and print their detail
 */
class customer
{
	
     private String name;
     private String email;
     private long mobile;
     private boolean fresher;
     private String dob;
     private String education;
     private int noticeperiod;
	
	
     public customer() {
    	 System.out.println("non-parametrized constructor.");
    	 
    	 
     }
     public customer(String name,String email,long mobile,boolean fresher,String dob,String education,int noticeperiod)
   {
    	 
    	 this.name= name;
         this.email=email;
         this.mobile=mobile;
         this.fresher=fresher;
         this.dob= dob;
         this.education= education;
         this.noticeperiod=noticeperiod;
   }
         public void display() {
        	 
        	 
    		 System.out.println("Name: "+name);
    		 System.out.println("email: "+email);
    		 System.out.println("mobile: "+mobile);
    		 System.out.println("Fresher:  "+fresher);
    		 System.out.println("DOB of student: "+dob);
    		 System.out.println("EDucation of student: "+education);
    		 System.out.println("Notice period of student:  "+noticeperiod);
    	 
     }
     
     
     
}
public class PojoClassDemo{
	 public static void main(String []args) {
		 
			System.out.println("Hello!!I am a POJOCLASS.");
		 
			customer c=new customer("chaitali", "chaitalibarhate@gamil.com", 9004005767L, true, "27 Nov 2001", "B.E", 2);
			c.display();
			
			customer c1=new customer();
			
	 }
	
}
