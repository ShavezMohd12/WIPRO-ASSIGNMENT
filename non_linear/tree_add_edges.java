package non_linear;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Edge1_1
{
	private int start;
	private int end;
	String type;
	public Edge1_1(int start, int end, String type) {
		super();
		this.start = start;
		this.end = end;
		this.type = type;
	}
	public int getStart() {
		return start;
	}
	public int getEnd() {
		return end;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Edge1_1 [start=" + start + ", end=" + end + ", type=" + type + "]";
	}
	
	
	
}
class tree_edge1_1
{
	
	List<Edge1_1> edges;
	public tree_edge1_1()
	{
		edges=new ArrayList<>();

	}
	
	public void joinVertices(int start, int end, String type)
	{
		Edge1_1 ed=new Edge1_1(start,end,type);
		edges.add(ed);
	}
	
	public List<Edge1_1> getEdges(int start)
	{
		List<Edge1_1> result=new ArrayList<>(); 
		for(Edge1_1 ed:edges)
		{
			if(ed.getStart()==start)
			{
				result.add(ed);
			}
		}
		return result;
	}

	void DFS(Stack<Integer> stack,int start)
	{
		for(Edge1_1 ed:edges)
		{
			if(ed.getStart()==start)
			{
				if(!stack.contains(start)) {
				stack.add(start);
				}
				if(!stack.contains(ed.getEnd())) {
				DFS(stack,ed.getEnd());
				}
			}
			else
			{if(!stack.contains(start)) {
				stack.add(start);}
				
			}
		}
	}
	
	
	
}




public class tree_add_edges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_edge1_1 te=new tree_edge1_1();
		te.joinVertices(1, 2,"1->2");	
		te.joinVertices(1, 3,"1->3");
		te.joinVertices(2, 4,"2->4");
		te.joinVertices(2, 5,"2->5");
		te.joinVertices(2, 1,"2->1");
		te.joinVertices(5, 3,"25>3");
		
		
		System.out.println(te.getEdges(1));
		Stack<Integer> stack=new Stack<>();
		te.DFS(stack,te.getEdges(1).getFirst().getStart());
		System.out.println(stack);
	}

}
