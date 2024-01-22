package anudip.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/* 
		 * while loops are another type of loop used to execute repitatively task
		 * 
		 * We use for loop when we know the exact number of times that we want to repear a task
		 * 
		 * while loop is used when we do not know how many times the task needs to be repeated
		 * 
		 * while(condition){
		 *  task;
		 *  increment/decrement;
		 * }
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		while(num>0) {
			num /=10;
			count++;
		}
		System.out.println(count);
	}

}
