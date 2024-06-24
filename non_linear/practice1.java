package non_linear;

import java.util.ArrayList;
import java.util.List;

//graph have edges,product,graphProduct


class Edge1
{
	//edge have start ,end and type
	private Product start;
	private Product end;
	private String type;
	public Edge1(Product start, Product end, String type) {
		super();
		this.start = start;
		this.end = end;
		this.type = type;
	}
	
	public Product getStart()
	{
		return start;
	}

	@Override
	public String toString() {
		return "Edge1 [start=" + start + ", end=" + end + ", type=" + type + "]";
	}
	
	
}

class graphProduct
{
	private List<Product> product;
	private List<Edge1> edges;
	
	public graphProduct()
	{
		product=new ArrayList<>();
		edges=new ArrayList<>();
	}
	
	public void addProduct(Product prod)
	{
		product.add(prod);
	}
	public void addEdges(Product start,Product end,String type)
	{
		Edge1 eg=new Edge1(start,end,type);
		edges.add(eg);
		//Assuming graph is undirected so we can add edge in both the direction
		edges.add(new Edge1(start,end,type));
	}
	public void containProduct(Product prod)
	{
		product.contains(prod);
	}
	public List<Edge1> getEdgeforProduct(Product prod)
	{
		List<Edge1> result=new ArrayList<>();
		for(Edge1 edge:edges)
		{
			if(edge.getStart().equals(prod))
			{
				result.add(edge);
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "graphProduct [product=" + product + ", edges=" + edges + "]";
	}
	
	
}




public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("lenovo",2300);
		Product p2=new Product("dell",2300);
		Product p3=new Product("samsung",2300);
		
		graphProduct gp=new graphProduct();
		gp.addProduct(p1);
		gp.addProduct(p2);

		gp.addProduct(p3);

		gp.addEdges(p1, p2,"type 1");
		gp.addEdges(p2, p3,"type 1");
		
		System.out.println(gp);
		System.out.println(gp.getEdgeforProduct(p1));
		
	}

}
