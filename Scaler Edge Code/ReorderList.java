//TC : O(n^2)
public class ReorderList {
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
	public static void print() {
	      ListNode temp=head;
	      while(temp!=null){
	    	  System.out.print(temp.val+" ");
	    	  temp=temp.next;
	      }
	      System.out.println();
	    } 
    public static ListNode reorderList(ListNode A) {
        if(A.next==null) return A;    
        ListNode ans=A;
        ListNode tail=ans;
        ListNode temp=A.next;
        boolean st=true;
        while(temp!=null){
           tail=addLastNode(tail,temp); 
           //System.out.println("tail: "+tail.val);
           tail.next=temp;
           tail=temp;
           temp=temp.next;
           tail.next=null;
           //System.out.println("tail2: "+tail.val);
        }
        head=ans;
        return ans;
       }
       public static ListNode addLastNode(ListNode tail,ListNode temp){
    	if(temp.next==null) return tail;   
    	if(temp.next.next==null){
    	  // System.out.println(temp.val+" "+temp.next.val);	
           tail.next=temp.next;
           tail=temp.next;
           tail.next=null;
           temp.next=null;
           return tail;
        }
    	//System.out.println(temp.val);
        return addLastNode(tail,temp.next);
       }
	
	public static void main(String[] args) {
//		insertBegining(6);
		insertBegining(5);
		insertBegining(4);
		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		print();
		reorderList(head);	
		print();
	}

}

