

//Definition for a Node.
class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
	Node(int val){
	 this.val=val;
	 prev=next=child=null;
	}
};

class FlattenMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
	 Node curr=head;
	 while(curr!=null){
      if(curr.child==null){
        curr=curr.next;
        continue;  
      }
      Node childNode=curr.child;
      
      while(childNode.next!=null){
          childNode=childNode.next;
      }
      childNode.next=curr.next;
      if(curr.next!=null) curr.next.prev=childNode;
      
      curr.next=curr.child;
      curr.child.prev=curr;
      curr.child=null;
      curr=curr.next;   
      
     }
    return head;    
  }
public static void main(String[] args) {
	FlattenMultilevelDoublyLinkedList obj=new FlattenMultilevelDoublyLinkedList();
		Node head=null;
	    Node n1=new Node(1);
	    Node n2=new Node(2);
	    Node n3=new Node(3);
	    n1.next=n2;
	    n2.next=n3;
	    Node n7=new Node(4);
	    Node n8=new Node(8);
	    Node n9=new Node(9);
	    n7.next=n8;
	    n8.next=n9;
	    n1.child=n7;
	    

	    head=n1;
	    obj.flatten(head);
		
		
	}
}
/*
 * 		Node head=null;
	    Node n1=new Node(1);
	    Node n2=new Node(2);
	    Node n3=new Node(3);
	    Node n4=new Node(4);
	    Node n5=new Node(5);
	    Node n6=new Node(6);
	    n1.next=n2;
	    n2.next=n3;
	    n3.next=n4;
	    n4.next=n5;
	    n5.next=n6;
	    Node n7=new Node(4);
	    Node n8=new Node(8);
	    Node n9=new Node(9);
	    n7.next=n8;
	    n8.next=n9;
	    n3.child=n7;
	    
	    Node n11=new Node(1);
	    Node n12=new Node(12);
	    n11.next=n12;
	    n8.child=n11;
	    head=n1;
	    obj.print(head);
	    obj.flatten(head);
 * */
 