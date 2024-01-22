package Fundametal;
/*method are block of code which will execute only if it is called.
//syntax for method= access specifier,return type,Method name.
// access specifier=It gives the scope of visibility for the method(public)(private),.
//public:it has the highest visibility. this type of method can be called from everywhere.even from another package.
//protected= it has less visibility than public.IT can be accessed by all by using extend of class.
//default= it has lesser visibility than protected.It can be accessed only by those classes which are in  the package.
we can't call default method in other package.
//private= It is give the least visibility.THis type of method is available for only for this class. 
*/
public class MethodDemo1 {
public void display() {
	
	System.out.println("this is the method of methoddemo1 class");
	
	
	
}
/* Below we are typing to call the protected show method of methodDemo1

*/
protected void show() {
	System.out.println("I am the show method which is protected");
	
	
}
void add() {
	
	System.out.println("we are addding.......");
	
	
}
private void subtract() {
	System.out.println("We are Subtract.......");
	
	
	
}



public static void main(String[] args) {
	MethodDemo1 md=new MethodDemo1();
	
	md.subtract();
	
	
	
	
}


}
