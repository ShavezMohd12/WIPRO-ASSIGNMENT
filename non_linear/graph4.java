package non_linear;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Edge4
{
	private int start;
	private int end;
	String type;
	public Edge4(int start,int end,String type)
	{
		this.start=start;
		this.end=end;
		this.type=type;
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
		return "Edge4 [start=" + start + ", end=" + end + ", type=" + type + "]";
	}
	
	
	
}

class productGraph4
{
	List<Integer> values;
	List<Edge4> edge;
	public productGraph4()
	{
		values=new ArrayList<>();
		edge=new ArrayList<>();
	}
	
	
	
	public List<Integer> getValues() {
		return values;
	}



	public List<Edge4> getEdge() {
		return edge;
	}



	public void addValue(int value)
	{
		values.add(value);
	}
	
	public void addEdges(int start,int end,String type)
	{
		Edge4 ed=new Edge4(start,end,type);
		edge.add(ed);
		//for undirected graph use again place end in start
		edge.add(new Edge4(end,start,type));
	}
	public List<Edge4> getProductEdge(int start)
	{
		List<Edge4> result=new ArrayList<>();
		for(Edge4 ed:edge)
		{
			if(ed.getStart()==start)
			{
				result.add(ed);
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return "productGraph4 [values=" + values + ", edge=" + edge + "]";
	}
	
	public void DFS(int start,Stack<Integer> stack)
	{
 
	    for(Edge4 ed:edge) {
	    	
	    	
	    	if(ed.getStart()==start)	
	    	{ 
	    		if(!stack.contains(ed.getEnd()))
	    		{
	    			if(!stack.contains(ed.getStart())) {
	    			     stack.push(start);
	    			     
	    			}	    			
	    			DFS(ed.getEnd(),stack);			
	    		}
	    		else if(!stack.contains(ed.getStart()))
	    		{   
	    			
	    			stack.push(ed.getStart());
	    		
	    		}
	    	}
	    
	    
	    }
	}
	
}

public class graph4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productGraph4 graph=new productGraph4();
		graph.addValue(1);
		graph.addValue(3);
		graph.addValue(2);
		graph.addValue(5);
		
		graph.addEdges(1, 3,"1->3");
		graph.addEdges(1, 2,"1->2");
		graph.addEdges(3, 5,"3->5");
		graph.addEdges(5, 1,"5->1");
		
		Stack<Integer> stack=new Stack<>();
		
//		System.out.println(graph);
//		System.out.println(graph.getProductEdge(1));
//		System.out.println(graph.getProductEdge(2));
//		System.out.println(graph.getProductEdge(3));
//		System.out.println(graph.getProductEdge(5));
		
		System.out.println(graph.getEdge());
//		System.out.println(graph.getValues().get(0));
	
//		getValue().get(0)
//		for()
		
		graph.DFS(graph.getValues().get(0),stack);
		System.out.println(stack);
	}

}