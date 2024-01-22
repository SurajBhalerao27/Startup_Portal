package Fundametal;

public class CircleTest {

	public double Area() {
	double R=6;
	double PI=3.14;
	double Result=R*R*PI;
	
	return Result;
	
	
	
}
public static void main(String [] args) {
	CircleTest ct=new CircleTest();
	double Ans=ct.Area();
	System.out.println("Area of circle:"+Ans);
	
	
}
}
