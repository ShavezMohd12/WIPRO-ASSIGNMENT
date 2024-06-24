package non_linear;

import java.util.ArrayList;
import java.util.List;

class treeNode{
	private Product product;
	private List<treeNode> children;
	public treeNode(Product product) {
		super();
		this.product = product;
		this.children=new ArrayList<>();
				
	}
	
	public void addChild(treeNode child)
	{
		children.add(child);
	}
	
	
	@Override
	public String toString() {
		return "treeNode [product=" + product + ", children=" + children + "]";
	}
	
}

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("Laptop",75000);
		Product p2=new Product("desktop",5000);
		Product p3=new Product("lenovo",5000);
		
		treeNode root=new treeNode(p1);
		treeNode node1=new treeNode(p2);	
		treeNode node2=new treeNode(p3);
		
		
		
		
		root.addChild(node1);
		root.addChild(node2);
		
		
		System.out.println(root);
	}

}
