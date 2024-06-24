package first;


class Node
	{
		int key;
		Node prev;
		Node next;
		Node(int d)
		{
			prev=null;
			key=d;
			next=null;
		}
	}
public class double_Linked {
 static Node head=null;
 static Node tail=null;
 static Node first=null;

 static int i=0;
 
 static void addNode(int k)
 {
	 Node new_node=new Node(k);
	 if(head==null)
	 {
		 head=new_node;
		 first=head;
		 tail=head;
	 }
	 else
	 {
		
		 first.next=new_node;
		 new_node.prev=first;
		 first =new_node;
		 tail=new_node;
	 }
	 i++;
 }
 static void insertAtBegining(int d)
 {
	 Node new_node=new Node(d);
	 if(head==null)
	 {
		 head=new_node;
		 first=new_node;
		 tail=new_node;
	 }
	 else {
	 new_node.next=head;
	 head.prev=new_node;
	 head=new_node;
	 }
	 i++;
 }
 static void insertAtEnd(int d)
 {
	 Node new_node=new Node(d);
	 if(head==null)
	 {
		 head=new_node;
		 first=new_node;
		 tail=new_node;
	 }
	 else {
		   first.next=new_node;
		   tail=new_node;
		   tail.prev=first;
		   first=new_node;
	 }
	 i++;
 }
 
 static void  insertAtPos(int k,int pos)
 {
	 pos--;
	 if(pos<0 || pos>i)
	 {
		 System.out.println("enter the correct position");
	 }
	 else if(pos==0)
	 {
		 //insert at beginning
		 insertAtBegining(k);
	 }
	 else if(pos==i-1)
	 {
		 //insert at the end
		 insertAtEnd(k);
	 }
	 else
	 {
		 Node src=head;
		 while(pos!=0)
		 {
			 src=src.next;
			 pos--;
		 }
		 Node A,B;
		 Node new_node=new Node(k);
		 
		 B=src;
		 A=src.prev;
		 new_node.next=B;
		 new_node.prev=A;
		 A.next=new_node;
		 B.prev=new_node;
		 i++;
	 }
	 
 }
 public static void deleteAtBegining()
 {
	 head=head.next;
	 i--;
 }
 public static void deleteAtEnd()
 {
	 tail=tail.prev;
	 tail.next=null;
	 i--;
 }
 public void deleteAtPos(int pos)
 {
	 pos--;
	 System.out.println("i"+i+"pos "+pos);
	 if(pos<0 || pos>i)
	 {
		 System.out.println("enter the correct position");
	 }
	 else if(pos==0)
	 {
		 //delete at beginning
		 deleteAtBegining();
	 }
	 else if(pos==i-1)
	 {
		 //delete at the end
		 deleteAtEnd();
	 }
	 else {
	 Node travel=head;
	 
	 while(pos!=0)
	 {
		 travel=travel.next;
		 pos--;
	 }
	 Node A,B;
	 A=travel.prev;
	 B=travel;
	 A.next=B.next;
	 B.next.prev=A;
	 B=null;
	 i--;
	 
	 }
 }
 public void print()
 {
	 
	 Node ptr=head;
	 while(ptr!=null)
	 {
		 System.out.print(ptr.key+" ");
		 ptr=ptr.next;
	 }
	 System.out.println();
	 Node ptrP=tail;
	 while(ptrP!=null)
	 {
		 System.out.print(ptrP.key+" ");
		 ptrP=ptrP.prev;
	 }
	 System.out.println();
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double_Linked dl=new double_Linked();
		dl.addNode(1);
		dl.addNode(2);
		dl.addNode(2);
		dl.addNode(2);
		dl.print();
		dl.insertAtPos(2, 1);
		dl.print();
//		dl.deleteAtBegining();
		dl.deleteAtPos(5);
		dl.print();
	}

}
