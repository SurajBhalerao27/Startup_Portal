package interfaces;

interface JavaSession{
	
	public void display();
	
}
abstract class PythonSession{
	
	abstract public void show(); 
	
}
class Anudip implements JavaSession{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

class Unique extends PythonSession{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class UpcastingForAbstractClass {
public static void main(String[] args) {
	
	JavaSession js=new Anudip();//upcasting parent interface is Javasession.
	                            //type variable refer to child Anudip object 
	
	PythonSession pj=new Unique();//parent class PythonSession type variable.
	                              //refer to child object to unique.
	
	
}
}
