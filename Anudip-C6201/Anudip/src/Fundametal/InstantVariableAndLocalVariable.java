package Fundametal;
//i=d;l=nd;
public class InstantVariableAndLocalVariable {

	
	int rollNo;
	String name;
	double marks;
	boolean fresher;
	//we can create constructors as private but we can't be create object in outer class.
	private InstantVariableAndLocalVariable(String s) {}
	
	public void display() {
		
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name of Student:"+name);
		System.out.println("Marks:"+marks);
		
		
	}
	public void show() {
		int empId;
		String empName;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstantVariableAndLocalVariable il=new InstantVariableAndLocalVariable("Chaitali");
		il.display();
		
	}

}
