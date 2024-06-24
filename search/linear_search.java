package search;

import java.util.Objects;

class Product
{
	private String name;
	private int salary;
	public Product(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public int getsalary()
	{
		return salary;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
class search
{
	public void search_key(int key,Product[] p)
	{
		int index=0;
		for(Product product:p)
		{ 
			if(product.getsalary()==key)
			{
				System.out.println("first occurance of Item found at index : "+index);
				break;
			}
			index++;
		}
	}
}

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] p=new Product[5];
		p[0]=new Product("shavez",1300);
		p[1]=new Product("xyz",1500);
		p[2]=new Product("b",13);
		p[3]=new Product("c",1500);
		p[4]=new Product("x",1300);
		search s=new search();
		s.search_key(1500,p);
		for(Product i:p) {
		System.out.println(i);
	   }
	}

}
