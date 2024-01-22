package stringdemo;

public class IndexOfDemo {

	public static void main(String[] args) {
	String movie="jailer the movier";
	System.out.println("Length of the movie:"+movie.length());
	
	int i=movie.indexOf('e');
	
	System.out.println("First index of character e:"+i);
	
	int j=movie.lastIndexOf('e');
	System.out.println("First index of character e:"+j);
	
	int k=movie.indexOf("the");
	System.out.println("index of the:"+k);
	
	int a=movie.indexOf('e',6);
	System.out.println("index of e from 6 index:"+a);
	 
	
	int b=movie.indexOf("the",4);
	System.out.println(" index of the from 4 index:"+b);
	}

}
