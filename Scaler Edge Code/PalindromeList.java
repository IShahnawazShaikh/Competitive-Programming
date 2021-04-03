public class PalindromeList {
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
	
    public static int lPalin(ListNode A) {
        int count=countNode(A);
        ListNode temp=A;
        int pos=1;
        while(pos<=count/2){
         temp=temp.next;
         pos+=1;
        }
        if(count%2==1) temp=temp.next;
        
        ListNode p=checkPalindromicNode(A,temp);
        if(p==null) return 0;
        return 1;
       }
   public static ListNode checkPalindromicNode(ListNode A,ListNode temp){
           if(temp==null) return A;
           
           A=checkPalindromicNode(A,temp.next);
           if(A==null || A.val!=temp.val) return null;
           return A=A.next;
       }
	public static void main(String[] args) {
		insertBegining(1);
		insertBegining(2);
		insertBegining(2);
		insertBegining(1);
		print();
	}

}
