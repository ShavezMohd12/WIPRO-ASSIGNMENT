package search;


class Product_{
	String name;
	int id;
	public Product_(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
}
class binary__search{
	
	public static int search(Product_[] p,int id)
	{
		int low=0,high=p.length-1;
		
		while(low<=high)
		{
		int mid=low+(high-low)/2;
		
		if(p[mid].getId()==id)
		{
			return mid;
		}
		if(p[mid].getId()<id)
		{
			low=mid+1;
		}
		if(p[mid].getId()>id)
		{
			high=mid-1;
		}
		}
		return -1;
	}
	
	
}
class jump__search{
	
	public static void search(Product_[] p,int id)
	{
		
		int jump=(int)Math.sqrt(p.length);
		int start=0;
		boolean b=true;
		
		if(p[p.length-1].getId()<id)
		{
			System.out.println("Element not found");
		}
		else
		{
			while(b!=false)
			{
				int skip=jump+start;
				
				if(skip>p.length-1)
				{
					skip=p.length-1;
				}
				
				if(id<=p[skip].getId())
				{
					for(int i=start;i<=skip;i++)
					{
						
						if(p[i].getId()==id)
						{
							System.out.println("Element found through Jump Search at Index: "+i);
							b=false;
						}
					}
				}
				else
				{
					start=skip;
				}
				
			}
		}
				
		
	}

	
}
class linear__search{
	
	public static int search(Product_[] p,int id)
	{
		int i=0;
		for(Product_ pro:p)
		{
				if(pro.getId()==id)
				{
					return i;
				}
				i++;
			}
		
		return -1;
	}

	
}





public class product_search {
	

	public static void main(String[] args) {
		Product_[] p=new Product_[] {new Product_("a",1),
				new  Product_("b",2),
				new Product_("c",3),
				new Product_("d",4)};
		int result=binary__search.search(p, 3);
		if(result==-1)
		{
			System.out.println("No found through Binaary Search");
		}
		else
		{
			System.out.println("found through Binaary Search At index : "+result);
		}
		
		
		int linear_result=linear__search.search(p, 2);
		if(linear_result==-1)
		{
			System.out.println("No found through linear Search");
		}
		else
		{
			System.out.println("found through linear Search At index : "+linear_result);
		}
		jump__search.search(p,1);
		
	}

}
