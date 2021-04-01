public class MergeKSortedList {
	static ListNode head = null;
	static int size = 0;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public static void insertBegining(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public static void print() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int countNode(ListNode A) {
		int count = 0;
		ListNode temp = A;
		while (temp != null) {
			count += 1;
			temp = temp.next;
		}
		return count;
	}
    public static ListNode mergeKLists(ListNode[] lists) {
        int i,n=lists.length;
        if(n==0) return null;  
        ListNode head1=lists[0];
        
        ListNode ans=lists[0];        
        for(i=1;i<n;i++){
          ListNode head2=lists[i];
          ListNode tail=null;
          ans=null;  
          while(head1!=null && head2!=null){

          if(head1.val<=head2.val){
              if(ans==null){
                ans=head1;
              }
             else{
               tail.next=head1;  
             }
             tail=head1;
             head1=head1.next;
             tail.next=null;   
            }
          else{
     
             if(ans==null){
                ans=head2;
              }
             else{
               tail.next=head2;  
             }
             tail=head2;
             head2=head2.next;
             tail.next=null;      
          }  
        }
       if(tail==null){
         if(head1!=null){
           ans=head1;  
           tail=head1;
           head1=head1.next; 
           tail.next=null;    
         }
       else if(head2!=null){
          ans=head2;
          tail=head2;
          head2=head2.next;
          tail.next=null;  
         }
        
       }     
       while(head1!=null){
         tail.next=head1;
         tail=head1;  
         head1=head1.next;
         tail.next=null;  
       }    
      while(head2!=null){
         tail.next=head2;
         tail=head2; 
         head2=head2.next;
         tail.next=null;  
       }     
       head1=ans;        
      }
    return ans;       
   }
	public static void main(String[] args) {
		insertBegining(5);
		insertBegining(4);
		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		print();
		
	}

}
