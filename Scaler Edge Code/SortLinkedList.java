import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortLinkedList {
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
    public int countNode(ListNode A){
			 int count=0;
			 ListNode temp=A;
			 while(temp!=null){
				count+=1;
				temp=temp.next;
			 }
			 return count;
		    }	
    public static ListNode solve(ListNode A) {
        ArrayList<Pair> list=new ArrayList<>();
        ListNode temp=A;
        while(temp!=null && temp.next!=null){
           ListNode p=temp;
           temp=temp.next.next;
          
           int val=p.val*10+p.next.val;
           p.next.next=null;
           Pair obj=new Pair(""+val,p);
           list.add(obj);
        }
        
        Collections.sort(list,new myComparator());
        
        ListNode ans=new ListNode(-1);
        ListNode curr=ans;
        for(int i=0;i<list.size();i++){
          Pair p=list.get(i);
          curr.next=p.node;
          curr=p.node.next;
        }
        head=ans.next;
        return ans.next;
       }
    static class myComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            return Integer.parseInt(a.val) - Integer.parseInt(b.val);
        }  
     }
    static class Pair{
        ListNode node;
        String val;
        Pair(String val,ListNode A){
         this.node=A;
         this.val=val;
        }
   } 
    public static void main(String[] args) {
		insertBegining(3);
		insertBegining(0);
		insertBegining(8);
		insertBegining(8);
		insertBegining(9);
		insertBegining(8);
		print();
		solve(head);
		print();
	}

}
