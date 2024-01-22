package Practice;

import javax.swing.Spring;

class Vehicle{
	
	private int wheelNo;
	private String colour;
	private int speedRate;
	
	
	public Vehicle(int WheelNo) {
		this.wheelNo=WheelNo;
		
	}
	public Vehicle(int WheelNo,String colour) {
    	this.wheelNo=WheelNo;
		this.colour=colour;
    	
    	
    }
    public Vehicle(int WheelNo,String colour,int speedRate) {
		this.wheelNo=WheelNo;
		this.colour=colour;
		this.speedRate=speedRate;
		
	}
    public int return1() {
    	return wheelNo;
    	
    }
    public String return2() {
    	return "It has "+wheelNo+"wheel"+"colour of bike"+colour;
    	
    }
    public String return3() {
    	return wheelNo+colour+speedRate;
    	
    }
	
}

public class ConstructorLoadingVehicle {
public static void main(String[] args) {
	Vehicle v=new Vehicle(2);
	
	Vehicle v1=new Vehicle(2,"black");
	
	Vehicle v2=new Vehicle(4,"Grey",80);
	
	System.out.println("It is two wheel like cycle:"+v.return1());
	
	System.out.println("It is two wheel like bike:"+v1.return2());
	
	System.out.println("It is four wheel like car:"+v2.return3());
	
	
}
}
