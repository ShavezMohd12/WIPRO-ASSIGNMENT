package non_linear;

import java.util.LinkedList;
import java.util.Objects;

class Product2
{
	private String name;
	private int price;
	
	public Product2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product2 [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product2 other = (Product2) obj;
		return Objects.equals(name, other.name);
	}
	
	
}





//in order to store and retrieve objects from the hashtable the 
//object used as they must implement the hashcode and equal
class hashtble
{
	
	
	private class hashNode
	{
		Product2 key;
		String value;
		hashNode next;
		
	
		public hashNode(Product2 key,String value)
		{
			super();
			this.key=key;
			this.value=value;
		}
	}
		
		private LinkedList<hashNode>[] buckets;
		private int capacity;
		private int size;
		
		public hashtble()
		{
			this.capacity=10;
			this.buckets=new LinkedList[capacity];
			this.size=0;
		}
		
		private int getBucketIndex(Product2 key)
		{
			int hashCode=key.hashCode();
			int index=hashCode % capacity;
			return Math.abs(index);
		}
		
		
		public void put(Product2 key,String value)
		{
			int bucketIndex=getBucketIndex(key);
			LinkedList<hashNode> bucket=buckets[bucketIndex];
			if(bucket==null)
			{
				bucket=new LinkedList<>();
				buckets[bucketIndex]=bucket;
				
			}
			for(hashNode node:bucket) {
				if(node.key.equals(key)) {
					node.value=value;
					
				}
			}
			
			hashNode newNode=new hashNode(key,value);
			bucket.add(newNode);
			size++;
			
			//resize the hash tbale if the load factor exceed 0.7
			if((1.0*size)/capacity>=0.7) {
				resize();
			}
		}
		public String get(Product2 key)
		{
			int bucketIndex=getBucketIndex(key);
			LinkedList<hashNode> bucket=buckets[bucketIndex];
			if(bucket==null)
			{
				return null;
				
			}
			for(hashNode node:bucket) {
				if(node.key.equals(key)) {
					
					return node.key+" "+node.value;
				}
			}
			return null;
		}
		
		private void resize()
		{
			LinkedList<hashNode>[] oldbuckets=buckets;
			capacity*=2;
			buckets=new LinkedList[capacity];
			size=0;
			
			for(LinkedList<hashNode> bucket:oldbuckets)
			{
				if(bucket!=null)
				{
					for(hashNode node:bucket) {
						put(node.key,node.value);
					}
				}
			}
		}
		
		public int size()
		{
			return size;
		}
		
	
}

public class hash_table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashtble hashTable=new hashtble();
		Product2 p1=new Product2("Laptop",1000);
		Product2 p2=new Product2("lenovo",1000);
		Product2 p3=new Product2("Laptop",1000);
		
		hashTable.put(p1,"5");
		hashTable.put(p2,"2");
		hashTable.put(p3,"3");
		
		System.out.println("size :"+hashTable.size());
		System.out.println("product details 1 "+hashTable.get(p1));
		System.out.println("product details 2 "+hashTable.get(p2));
		System.out.println("product details 3 "+hashTable.get(p3));
		
		
	}

}
