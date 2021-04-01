
public class AddTwoNumbersLists {
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

	public static ListNode addTwoNumbers(ListNode A, ListNode B) {
		ListNode temp1 = A;
		ListNode temp2 = B;
		int num1 = 0, num2 = 0, carry = 0, sum = 0;
		ListNode head = null, tail = null;
		while (temp1 != null || temp2 != null) {
			num1 = 0;
			num2 = 0;
			if (temp1 != null) {
				num1 = temp1.val;
			}
			if (temp2 != null) {
				num2 = temp2.val;
			}
			sum = num1 + num2 + carry;
			ListNode newNode = new ListNode(sum % 10);
			carry = sum / 10;

			if (head == null) {
				head = newNode;
			} else {
				tail.next = newNode;
			}
			tail = newNode;

			if (temp1 != null)
				temp1 = temp1.next;
			if (temp2 != null)
				temp2 = temp2.next;
		}

		if (carry != 0) {
			ListNode carryNode = new ListNode(carry);
			tail.next = carryNode;
		}
		return head;

	}

	public static void main(String[] args) {
		insertBegining(5);
		insertBegining(4);
		insertBegining(3);
		insertBegining(2);
		insertBegining(1);
		print();
		addTwoNumbers(head,head);
		
	}

}
