package Day2;

import java.util.*;

public class StackPrac {

	public static void main(String[] args) {
			Stack<Integer> s=new Stack<Integer>();
			s.push(2);
			s.push(8);
			s.push(9);
			s.push(3);
			s.push(5);
			System.out.println(s);
//			s.pop();// remove last element from the stack
//			System.out.println(s);
//			s.pop();
//			System.out.println(s);
//			System.out.println(s.peek());
			System.out.println(s.search(9));

	}

}
