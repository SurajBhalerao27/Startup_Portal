package data_struct_and_algo;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> gameStack = new Stack<>();

		gameStack.push("MineCraft");
		gameStack.push("BGMI");
		gameStack.push("COC");
		gameStack.push("Battle Royal");

		// to check the stack is empty or not // here we pushes some elements so it returns false.
		System.out.println(gameStack.empty());

		// to see the top item
		System.out.println(gameStack.peek());

		// to remove the top item
		System.out.println(gameStack.pop());

		// to see the whole stack
		System.out.println(gameStack); // as in the upper line we remove the top item so it returns only the left items

		gameStack.pop();
		gameStack.pop();
		gameStack.pop();
		// to this upper line the stack is empty and if we trying to pop one more item then we get exception -> "EmptyStackException"
		System.out.println(gameStack.empty()); // just checking is the stack is empty or not
		gameStack.pop();
	}
}
