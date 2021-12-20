public class RemoveDuplicatesFromSortedList {
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
        
        ListNode prev=A;
        ListNode temp=A.next;
        while(temp!=null){
           if(prev.val!=temp.val){
             prev=temp;
           }
           else{
             ListNode t=deleteSameNode(prev,temp);
             prev.next=t;
             prev=t;
             temp=t;
           }
           if(temp!=null) temp=temp.next;
        }
        return A;
       }
       public static ListNode deleteSameNode(ListNode prev,ListNode temp){
         while(temp!=null && prev.val==temp.val){
           ListNode t=temp;
           temp=temp.next;
           t=null;
         }
         return temp;
       }
	public static void main(String[] args) {
		insertBegining(1); 
		insertBegining(2); 
		insertBegining(2); 
		insertBegining(2); 
		insertBegining(3); 
		insertBegining(3); 
		print();
		deleteDuplicates(head);
		print();
	}

}
