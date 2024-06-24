package first;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<>();
		l.add("1");
		l.add("3");
		l.add("4");
		l.add("5");
		
		Iterator<String> ir=l.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
