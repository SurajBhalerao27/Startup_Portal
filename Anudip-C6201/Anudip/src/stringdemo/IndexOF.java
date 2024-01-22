package stringdemo;

public class IndexOF {
public static void main(String[] args) {
	String s="Yellow Umbrella";
	System.out.println("Length of the movie:"+s.length());
	//int count=s.indexOf('l');

	for(int i=0;i<s.length();i++) {
		
		char ch=s.charAt(i);
		
		if(ch=='l') {
			
			System.out.println(i);
		}
		
		
	}
	
  }
}
