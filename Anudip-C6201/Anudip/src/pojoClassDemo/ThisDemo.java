package pojoClassDemo;
//call the the constructor using this keyword.
//at calling we are call constructor only one time
//meaning we can't call one constructor for multiple times
//constructor call should be first line of code.
public class ThisDemo {
	int rollNo;
	String name;
	ThisDemo(){
		
		System.out.println("This is non parametrized constructor.");
	}
	ThisDemo(int rollNo){
		
		System.out.println("This is one paramertized construcor");
		
	}
	ThisDemo(int rollNo,String name){
		this(200);
		
		System.out.println("this is two paramertized constructor");
		
	}
	public static void main(String[] args) {
		ThisDemo td=new ThisDemo(200,"chaitali");
}
}
