/*
 * make a class ClothingApp{}
 * It should have methods addToCart(){}, addReview(){} and placeOrder(){}
 * 
 * make class Myntra{}
 * change the behaviour of addToCart(){} in Myntra app
 * Myntra should have its own methods
 * 
 * Demonstrate upcastign in this program.
 * */

package polymorphisms;

class ClothingApp {
	public void addTOCart() {System.out.println("Item added to cart");}
	public void addReview() {System.out.println("Give review for the product");}
	public void placeOrder() {System.out.println("Your order is placed");}
}

class Myntra extends ClothingApp{
	public void addTOCart() {System.out.println("Do you have subscription");}
	public void userLogin() {System.out.println("Login");}
	public void ratings() {System.out.println("Rate product out of 5 Stars");}
	public void payments() {System.out.println("This is payments window");}
	public void deliveryAddress() {System.out.println("Provide Delivery address for the shoping");}
	
}

public class UpcastingPract1 {

	public static void main(String[] args) {
		ClothingApp ca = new Myntra(),ca1=new Myntra();
		ca.addReview();
		ca.addTOCart();
		ca.placeOrder();
	}

}
