package pojoClassDemo;


class Student{
	 private String name;
     private String email;
     private long mobile;
     private boolean fresher;
     private String dob;
     private String education;
     private int noticeperiod;
	
     
     
     public Student(String name,String email,long mobile,boolean fresher,String dob,String education,int noticeperiod)
     {
    	 this.name= name;
         this.email=email;
         this.mobile=mobile;
         this.fresher=fresher;
         this.dob= dob;
         this.education= education;
         this.noticeperiod=noticeperiod;
     
     
     
     }
     
     public Student(String name,String email,long mobile) 
     {
     	
    	 this.name= name;
         this.email=email;
         this.mobile=mobile;
     	
     }
     public Student(String name,String email,long mobile,boolean fresher) 
     {
     	
    	 this.name= name;
         this.email=email;
         this.mobile=mobile;
         this.fresher=fresher;
	
	
     }
     
     public void display() {
    	 
		 System.out.println("Name: "+name);
		 System.out.println("email: "+email);
		 System.out.println("mobile: "+mobile);
		 System.out.println("Fresher:  "+fresher);
		 System.out.println("DOB of student: "+dob);
		 System.out.println("EDucation of student: "+education);
		 System.out.println("Notice period of student:  "+noticeperiod);
    	 
		 System.out.println("\n");
    	 
     }
	
	
	
	
}
public class PojoClassDemo2 {
public static void main(String [] args) {
	Student s=new Student("chaitali", "chaitalibarhate@gamil.com", 9004005767L, true, "27 Nov 2001", "B.E", 2);
	s.display();
	Student s1=new Student("Mohini", "Mohinidhadi@gamil.com", 87678771567L);
	s1.display();
	
	
	Student s2=new Student("Rutu", "rutubagde@gamil.com", 8767564390L, false);
	s2.display();
}	     
	
}
