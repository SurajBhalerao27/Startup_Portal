/*
 * we can use super keyword for method also. 
 * 
 */

package inheritance;
class Opps{
	int salecount=8;
	public void show() {
		
		System.out.println("No of mobile sales by opps:"+salecount);
		
	}
	
}
class RealMe extends Opps{
	int salecount=10;
	public void sales() {
			System.out.println("No of mobile sales by Realme:"+salecount);
		
			super.show();//improtant syntax.
		
	
	
		System.out.println("No of mobile sales by opps:"+super.salecount);
	}
}
public class SuperKeyWord2 {

	public static void main(String[] args) {
		RealMe rm=new RealMe();
		rm.sales();
		

	}

}
