public class RotateList {
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
	public static int countNode(ListNode A){
			 int count=0;
			 ListNode temp=A;
			 while(temp!=null){
				count+=1;
				temp=temp.next;
			 }
			 return count;
		    }	
    public static ListNode ans=null;
	public static ListNode rotateRight(ListNode A, int k) {	
       ListNode temp=A;
       int count=countNode(A); 
       k=k%count;  //manage rotation
       k=(count-k+count)%count; // finding k value from last which will come at first
       if(k==0) return A;
       int pos=1;
       while(pos<k){
    	 temp=temp.next; 
    	 pos+=1;
       }
       ListNode p=temp.next;
       temp.next=null;
       temp=p;
       System.out.println(p.val);
       while(temp.next!=null){
    	  temp=temp.next; 
       }
       System.out.println(temp.val);
       temp.next=head;
       head=p;
       return p; 
      }
	public static void main(String[] args) {
		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		
		print();
		rotateRight(head,10);
		print();
		
	}

}
