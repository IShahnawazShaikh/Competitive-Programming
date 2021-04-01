
public class ReorderList2 {
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
        int n=countNode(A);
        ListNode ans=A;
        ListNode tail=ans;
        ListNode temp=A.next;
        
        int pos=1;
        while(pos<n/2){
          tail.next=temp;
          tail=temp;
          temp=temp.next;
          tail.next=null;
          pos+=1;
        }
        tail.next=null;
        tail=ans;
//        System.out.println(tail.val);
//        System.out.println(temp.val);
        tail=addLastNode(tail,temp);
        
        
        head=ans;
        return ans;
       }
   public static ListNode addLastNode(ListNode tail,ListNode temp){
     if(temp==null){
      return tail;    
     }
    	   
     tail=addLastNode(tail,temp.next);
     if(tail.next==null) {
    	 tail.next=temp;
    	 tail=temp;
    	 tail.next=null;
    	 //System.out.println("tail: "+tail.val);
    	 return tail;
     }
     ListNode t=tail.next;
     tail.next=temp;
     temp.next=t;
     tail=t;
     return tail;
    }
   public static int countNode(ListNode A){
	 int count=0;
	 ListNode temp=A;
	 while(temp!=null){
		count+=1;
		temp=temp.next;
	 }
	 return count;
    }
	public static void main(String[] args) {
//		insertBegining(6);
//		insertBegining(5);
//		insertBegining(4);
//		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		print();
		reorderList(head);	
		print();
	}

}

