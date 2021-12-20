import java.util.PriorityQueue;

public class MergeKSortedLinkedListPriorityQueue {
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
     PriorityQueue pq = new PriorityQueue();
     for(ListNode list : lists)	{
    	while(list != null){
    	pq.add(list.val);
    	list = list.next;
    	 }
       }
      ListNode result = new ListNode(0);
      ListNode curr = result;
      while(!pq.isEmpty()){
    	 curr.next = new ListNode((int)pq.poll());
    	 curr = curr.next;
      }
     return result.next;     
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
