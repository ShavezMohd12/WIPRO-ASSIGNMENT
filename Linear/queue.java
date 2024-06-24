package first;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<>();
		q.offer("1");
		q.offer("2");
		q.offer("3");
		System.out.println(q);
		System.out.println(q.size());
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
		
		
		}

}
