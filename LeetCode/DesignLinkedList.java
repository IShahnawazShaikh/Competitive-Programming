class DesignLinkedList {
    Node head;
    Node tail;
    int size;
    class Node{
        int val;
        Node next; 
        Node(int val){
          this.val=val;
          next=null;  
        } 
     }
    /** Initialize your data structure here. */
    public DesignLinkedList() {
      head=null;
      tail=null;
      size=0;  
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {	
     if(index> size-1) return -1;   
     Node temp=head;
     int pos=0;   
     while(pos<index){
       temp=temp.next;
       pos+=1;  
     }   
     return temp.val;   
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
      Node newNode=new Node(val);
      size+=1;  
      if(head==null){
        head=newNode;
        tail=newNode;
         return;  
       }
       newNode.next=head;
       head=newNode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
     Node newNode=new Node(val);
     size+=1;   
      if(head==null){
        head=newNode;
        tail=newNode;
        return;  
      }
     tail.next=newNode;
     tail=newNode; 
     //System.out.println("tail: "+tail.val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
      if(index>size) return;
      if(index==0) {addAtHead(val); return;}
      if(index==size) {addAtTail(val); return;} 
      int pos=0;
      Node temp=head; 
      while(pos<index-1){
        
        temp=temp.next;  
        pos+=1;  
      }
      Node newNode=new Node(val);   
      newNode.next=temp.next;  
      temp.next=newNode; 
      size+=1;  
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
     if(index<0 || index>size-1) return;
     if(index==0){
       head=head.next;
       return;  
     }
     int pos=0;
     Node temp=head;   
     while(pos<index-1){
      temp=temp.next;  
      pos+=1;   
     }
     temp.next=temp.next.next;
     if(index==size-1) tail=temp; 
     size-=1;  
     //System.out.println("tail at delete: "+tail.val);
    }
    
    public void print(){
      Node temp=head;
      while(temp!=null){
    	System.out.print(temp.val+" "); 
    	temp=temp.next;
      }
     System.out.println(); 
    }
    public void getSize(){
     System.out.println("size: "+size);	
    }
    public static void main(String...x){
    	DesignLinkedList LinkedList=new DesignLinkedList();
    	LinkedList.addAtHead(7);
    	LinkedList.addAtHead(2);
    	LinkedList.addAtHead(1);
    	LinkedList.print();
    	LinkedList.getSize();
    	
    	
    	LinkedList.addAtIndex(3,0);
    	LinkedList.print();
    	LinkedList.getSize();
    	
    	LinkedList.deleteAtIndex(2);
    	LinkedList.print();
    	LinkedList.getSize();
    	
    	LinkedList.addAtHead(6);
    	LinkedList.print();
    	LinkedList.getSize();
    
    	
    	LinkedList.addAtTail(4);
    	LinkedList.print();
    	LinkedList.getSize();
    	
    	
   	 System.out.println("get: "+LinkedList.get(4));
 	 LinkedList.deleteAtIndex(4);
 	 LinkedList.print();
 	 LinkedList.getSize();
   	 
    }
}

  