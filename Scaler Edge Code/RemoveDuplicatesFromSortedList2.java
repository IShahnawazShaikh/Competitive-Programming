public class RemoveDuplicatesFromSortedList2 {
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
    public static ListNode deleteDuplicates(ListNode A) {
   	    if(A==null || A.next==null) return A;
    	ListNode ans=null,tail=null;
    	boolean looprun=true;
    	while(A!=null){
    		looprun=false;
            while(A.next!=null && A.val==A.next.val){
                A=A.next;
               looprun=true;
             }
            if(looprun==false){
              if(ans==null){
            	ans=A;
              }
              else{
            	tail.next=A;
              }
          	  tail=A;
        	  A=A.next;
        	  tail.next=null;
            }
            else A=A.next;      
    	}
    	head=ans;
    	if(ans==null) return null;
        else return ans;
    }
	public static void main(String[] args) {
		insertBegining(0);
		insertBegining(0);
		insertBegining(0);
		insertBegining(1);
		insertBegining(1);
		insertBegining(3);
		insertBegining(3);
		insertBegining(3); 
		insertBegining(5); 
		insertBegining(5); 
		insertBegining(5); 
		print();
		deleteDuplicates(head);
		print();
	}

}
