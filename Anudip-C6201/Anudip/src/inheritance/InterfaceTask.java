package inheritance;

interface LoginAndResistration{
	
	public void LoginAndResistration();
}
interface ProductAndGallery{
	
	public void ProductAndGallery();
	
}
interface ShippingOptions{
	
	public void ShippingOptions();
	
}
interface ShoppingCart{
	
	public void ShoppingCart();
	
}
interface  OrderSummary{
	
	public void OrderSummary();
	
}

class Amazon implements LoginAndResistration,ProductAndGallery,ShoppingCart,ShippingOptions,OrderSummary{

	@Override
	public void OrderSummary() {
		System.out.println("This is Ordersummary method of amazon.");
		
	}

	@Override
	public void ShippingOptions() {
		// TODO Auto-generated method stub
		System.out.println("This is ShippingOptions method of amazon.");
	}

	@Override
	public void ShoppingCart() {
		// TODO Auto-generated method stub
		System.out.println("This is ShoppingCart method of amazon.");
	}

	@Override
	public void ProductAndGallery() {
		// TODO Auto-generated method stub
		System.out.println("This is ProductAndGallery method of amazon.");
	}

	@Override
	public void LoginAndResistration() {
		// TODO Auto-generated method stub
		System.out.println("This is LoginAndResistration method of amazon.");
	}
	
	
	
}
class JioMart implements LoginAndResistration,ProductAndGallery,ShoppingCart,ShippingOptions,OrderSummary{

	@Override
	public void OrderSummary() {
		// TODO Auto-generated method stub
		System.out.println("This is Ordersummary method of JioMart.");
	}

	@Override
	public void ShippingOptions() {
		// TODO Auto-generated method stub
		System.out.println("This is ShippingOption method of JioMart.");
	}

	@Override
	public void ShoppingCart() {
		// TODO Auto-generated method stub
		System.out.println("This is ShoppingCart method of JioMart.");
	}

	@Override
	public void ProductAndGallery() {
		// TODO Auto-generated method stub
		System.out.println("This is ProductAndGallery method of JioMart.");
	}

	@Override
	public void LoginAndResistration() {
		// TODO Auto-generated method stub
		System.out.println("This is LoginAndResistration method of JioMart.");
	}
	
	
	
	
	
}
public class InterfaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JioMart j=new JioMart();
		j.LoginAndResistration();
		j.ShippingOptions();
		Amazon a=new Amazon();
		a.ShippingOptions();
		a.ShoppingCart();
	}

}
