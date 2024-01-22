package practice;
import java.util.Scanner;
class Student1 {
	String name;
    int roll;
    int marks;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Name, Roll_no And Marks: ");
            sc.nextLine(); // consume the newline character after roll
            name = sc.nextLine(); // read the full name with spaces
            sc.close();
            roll = sc.nextInt();
            marks = sc.nextInt();

        }
    }

    void show() {
        System.out.println("Name = " + name + "\nRoll_no = " + roll  + "\nMarks = " + marks);
    }
}

public class Studentdemo1 {
    public static void main(String[] args) {
        Student1 s[] = new Student1[6];
        for(int i =0;i<7;i++) {
        	s[i]= new Student1();
        	s[i].input();
        }
        System.out.println("Details Are : \n");
        for(int i=0;i<7;i++) {
        	s[i].show();
        }
    }
}
