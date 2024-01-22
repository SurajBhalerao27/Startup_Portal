package multithreadingExamples;
/*
 * Multithreading is a type of multitasking. 
 * In multithreading we can execute two or more threads simultaneously.
 * Thread is the smallest unit of code that can be run separately.
 * 
 * To make a thread we can use Runnable interface or Thread class.
 * Runnable interface: It is a functional interface and it has only one abstract method
 * 						i.e. public void run(){} method
 * 
 * Thread class: Thread class implements Runnable interface, hence run method is inherited
 * by Thread class from Runnable interface. Apart from this Thread class has many other
 * predefined methods such as start(), setPriority(), getPriority() etc
 */
class Animation{
	
	public void walking() {
		
		for(int i=1; i<=10;i++) {
			
			System.out.println("Boy is walking.....");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void singing() {
		for(int i=1; i<=10;i++) {
			
			System.out.println("Boy is singing.....");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void raining() {
		for(int i=1; i<=10;i++) {
			
			System.out.println("It is raining in the background.....");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Thread1 extends Thread{
	Animation a;
	
	Thread1(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		a.walking();
	}
}

class Thread2 extends Thread{
	Animation a;
	
	Thread2(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		a.singing();
	}
}

class Thread3 extends Thread{
	Animation a;
	
	Thread3(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		a.raining();
	}
}
public class Example1 {

	public static void main(String[] args) {
	
		Animation a=new Animation();
		/*
		 * a.walking(); a.singing(); a.raining();
		 */
		
		
		  Thread1 t1=new Thread1(a); 
		  Thread2 t2=new Thread2(a); 
		  Thread3 t3=new Thread3(a);
		  
		  t1.start(); t2.start(); t3.start();
		 

	}

}
