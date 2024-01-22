package inheritance;

interface Camera{
	
	public  void  clickPic();
}

interface PhoneCall{
	public void calling();
	
}
class Landline implements Camera {

	@Override
	public void clickPic() {
		System.out.println("this is clickpic method ");
		
	}
	
}
class candycrush extends Mobiles implements Camera,PhoneCall{
	
	public void increasePoint() {
		
		System.out.println("Point increased on three match");
		
		
	}
	public void backgroundMusic() {
		
		System.out.println("Background music is playing.....");
		
	}
	public void graphics() {
		
		System.out.println("Graphics of the game is changing according to stage of game..");
		
		
		
	}
}
 class Mobiles implements Camera,PhoneCall{

	@Override
	public void calling() {
		
		System.out.println("this is calling methods.");
	}

	@Override
	public void clickPic() {
		
		System.out.println("this is clickpic method in class mobile.");
	}
	 
	 
	 
 }




public class InterfaceDemo4 {
public static void main(String[] args) {
	
	Mobiles m=new Mobiles();
	m.calling();
	m.clickPic();
}
}


