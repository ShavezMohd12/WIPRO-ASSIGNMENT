package first;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1=new Stack<>();
		s1.push("1");
		s1.push("2");
		s1.push("3");
		System.out.println(s1.peek());
		System.out.println(s1.pop());
	}

}
