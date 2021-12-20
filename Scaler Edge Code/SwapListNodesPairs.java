
public class SwapListNodesPairs {
	static ListNode head=null;
	static int size=0;
    static class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
    	 this.val=val;
    	 next=null;
      }
    }
    public static void insertBegining(int value) {
    	ListNode newNode=new ListNode(value);
    	if(head==null){
    	  head=newNode;
    	  return;
    	}
    	newNode.next=head;
    	head=newNode;
    }
	public static void print_ll() {
	      ListNode temp=head;
	      while(temp!=null){
	    	 System.out.print(temp.val+" ");
	    	  temp=temp.next;
	      }
	      System.out.println();
	    } 
	
    public static ListNode swapPairs(ListNode A) {
     if(A==null || A.next==null) return A;
     ListNode temp=A;
     ListNode curr=A.next.next;
     A=A.next;
     A.next=temp;
     temp.next=null;
 
     while(curr!=null && curr.next!=null){
       temp.next=curr.next;
       temp=curr;
       ListNode ptr=curr.next.next;
       curr.next.next=curr;
       temp.next=null;
       curr=ptr;
     }
     if(curr!=null) temp.next=curr;
     head=A;
     return A;	
       	
    }
   private static void reversePair(ListNode temp) {
	 temp.next=temp.next.next;
	 temp.next.next=temp;
		
   }
	public static void main(String[] args) {
		insertBegining(4);
		insertBegining(3);
		
		insertBegining(2);
		insertBegining(1);
		print_ll();
		
		swapPairs(head);
        print_ll();
		
	}

}
