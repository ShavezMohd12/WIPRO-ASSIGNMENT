package non_linear;


class NBinaryNode
{
	NBinaryNode left,right;
	int key;
	public NBinaryNode(int key)
	{
		this.key=key;
		left=right=null;
	}
}

class BinarySearch
{
	NBinaryNode root;
	public BinarySearch()
	{
		root=null;
	}
	
	void insert(int key)
	{
		root=insertRec(root,key);
		
	}
	void delete(int key) {
		root=deleteRec(root,key);
	}
	
	
	public NBinaryNode insertRec(NBinaryNode root,int key)
	{
		if(root==null)
		{
			root=new NBinaryNode(key);
			return root;
		}
		else if(key<root.key)
			root.left=insertRec(root.left,key);
		else if(key>root.key)
			root.right=insertRec(root.right,key);
		
		return root;
	}
	
	
	NBinaryNode deleteRec(NBinaryNode root,int key)
	{
		if(root==null)
		{
			return root;
		}
		if(key<root.key)
			root.left=deleteRec(root.left,key);
		else if(key>root.key)
			root.right=deleteRec(root.right,key);
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			root.key=minValue(root.right);
			root.right=deleteRec(root.right,root.key);
		}
		return root;
	}
	private int minValue(NBinaryNode root)
	{
		int minv=root.key;
		while(root.left!=null)
		{
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	
	
	 void inorder() { 
		 inorderRec(root); 
		 System.out.println();
		 }
	 
	    // A utility function to
	    // do inorder traversal of BST
	    void inorderRec(NBinaryNode root)
	    {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }
	    void preorder() { 
	    	preorderRec(root); 
	    	 System.out.println();
	    }
	    
	    // A utility function to
	    // do inorder traversal of BST
	    void preorderRec(NBinaryNode root)
	    {
	    	if (root != null) {
	    		System.out.print(root.key + " ");
	    		preorderRec(root.left);
	    		preorderRec(root.right);
	    	}
	    }
		
}

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch root=new BinarySearch();
		root.insert(50); 
		root.insert(30); 
		root.insert(20); 
		root.insert(40); 
		root.insert(70); 
		root.insert(60); 
		root.insert(80); 
		
		
		
		root.preorder();
//		root.postorder();
		root.inorder();
		
		
		
		
	}

}
