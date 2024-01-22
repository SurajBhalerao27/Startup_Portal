package stringdemo;

public class SplitDemo {

	public static void main(String[] args) {
		String team="Indian Hockey Team";
		String[] s=team.split(" ");
	     System.out.println("Original String:"+team);
		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
		}
     
	}

}
