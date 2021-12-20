//Not Done

public class ReverseLinkedListII {
	static ListNode head=null;
    static class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
    	 this.val=val;
    	 next=null;
      }
    }
   public static void reverseList(int left,int right){    
	 int pos=1;
	 ListNode temp=head;
	 while(pos<left-1){
		temp=temp.next;
		pos+=1;
	 }
	 ListNode reverseNode=null;
	 if(left==1){
	   head=gerReverse(temp,left,right);
	 }
	 else {
	  reverseNode=gerReverse(temp.next,left,right);
	  temp.next=reverseNode;
	 }
	   
   }
   public static ListNode gerReverse(ListNode head,int left,int right) {
        ListNode prevNode=null;
        ListNode nextNode=null;
        
        ListNode curr=head;
        ListNode ptr=head;
        while(curr!=null && left<=right){
            nextNode=curr.next;
            curr.next=prevNode;
            prevNode=curr;
            curr=nextNode;
            left+=1;
        }
        ptr.next=curr;
        System.out.println(ptr.val);

        return prevNode;
        
      }   
    public static void insert_node(int value) {
    	ListNode newNode=new ListNode(value);
 
    	if(head==null){
    	  head=newNode;
    	  return;
    	}
       newNode.next=head;
       head=newNode;
    }
	public static void print() {
	      ListNode temp=head;
	      while(temp!=null){
	    	 System.out.print(temp.val+" ");
	    	  temp=temp.next;
	      }
	      System.out.println();
	  } 
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) insert_node(i);
		print();
		reverseList(3,3);
		print();
	}

}
