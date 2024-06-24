package non_linear;

import java.util.ArrayList;
import java.util.List;

class Edge{
	
	private Product start;
	private Product end;
	private String type;
	
	public Edge(Product start, Product end, String type) {
		super();
		this.start = start;
		this.end = end;
		this.type = type;
	}
	
	
	
	public Product getStart() {
		return start;
	}



	public Product getEnd() {
		return end;
	}



	public String getType() {
		return type;
	}



	@Override
	public String toString() {
		return "edge [start=" + start + ", end=" + end + ", type=" + type + "]";
	}
	
	
	
}

class productGraph{
	private List<Product> product;
	private List<Edge> edges;
	
	//default constructor
	public productGraph()
	{
		this.product=new ArrayList<>();
		this.edges=new ArrayList<>();
	}

//	public List<Product> getProduct() {
//		return product;
//	}
//
//	
//
//	public List<edge> getEdges() {
//		return edges;
//	}

	public void addProduct(Product product)
	{
		this.product.add(product);
	}
	public void addEdge(Product start,Product end,String type)
	{
		Edge e=new Edge(start,end,type);
		edges.add(e);
		//assuming graph is undirected , so we can add edges in both direction
		edges.add(new Edge(start,end,type));
	}
	//check if product exist or not
	public boolean containsProduct(Product prod)
	{
		return product.contains(prod);
	}
	//get all edges connected to a specified product
	public List<Edge> getEdgesforProduct(Product prod)
	{
		List<Edge> result=new ArrayList<>();
		for(Edge edge:edges)
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
		return "productGraph [product=" + product + ", edges=" + edges + "]";
	}
	
	

}

public class graph {
	public static void main(String[] arg)
	{
		Product p1=new Product("lenovo",2300);
		Product p2=new Product("dell",2300);
		Product p3=new Product("samsung",2300);
		
		productGraph grap=new productGraph();
		grap.addProduct(p1);
		grap.addProduct(p2);
		grap.addProduct(p3);
		grap.addEdge(p1, p2,"type1");
		grap.addEdge(p2, p3,"type3");
		
		System.out.println(grap);
		System.out.println("edges for the product 1: "+grap.getEdgesforProduct(p1));
	}
}
