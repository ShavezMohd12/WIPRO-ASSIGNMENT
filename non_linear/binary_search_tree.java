package non_linear;

class Node{
	int key;
	Node left,right;
	public Node(int item)
	{
		this.key=item;
		left=right=null;
	}
}

public class binary_search_tree {
	Node root;
	binary_search_tree()
	{
		root=null;
	}
	void insert(int key)
	{
		root=insertRec(root,key);
	}
	private Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left,key);
		if(key>root.key)
			root.right=insertRec(root.right,key);
		return root;
	}
	void inorder()
	{
		inorderRec(root);
		
	}
	void preorder()
	{
		preorderRec(root);
	}
	void postorder()
	{
		postorderRec(root);
		
	}
	void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
	void preorderRec(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	void postorderRec(Node root)
	{
		if(root!=null)
		{
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.key);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_search_tree bst=new binary_search_tree();
				bst.insert(25);
				bst.insert(15);
				bst.insert(10);
				bst.insert(4);
				bst.insert(12);
				
				System.out.println("inorder Traversal of tree :");
				bst.inorder();
	}

}
