package leetCode;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Two {

	public static ListNode create(int a[]) {
		int n = a.length;
		ListNode first = new ListNode(a[n - 1]), next = null;
		for(int i = n - 2; i >= 0; i--) {
			next = first;
			first = new ListNode(a[i]);
			first.next = next;
		}
		return first;
	}
	
	public ListNode reverse(ListNode first) {
		
		ListNode prev = null, cur = first, next;
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode n1 = l1, n2 = l2, next = null, first = null;
		int c = 0, a, b, tmp;
		
		while(n1 != null || n2 != null || c != 0) {
			a = 0;
			b = 0;
			if(n1 != null) {
				a = n1.val;
				n1 = n1.next;
			}
			if(n2 != null) {
				b = n2.val;
				n2 = n2.next;
			}
			next = first;
			tmp = a + b + c;
			first = new ListNode(tmp % 10);
			first.next = next;
			c = tmp / 10;
		}
		ListNode ret = reverse(first);
		return ret;
		
    }
	
	public static void main(String [] args) {
		int a[] = {9}, b[] = {1, 9, 9, 9, 9, 9, 9, 9, 9};
		ListNode l = create(a), r = create(b);
		
		Two two = new Two();
		ListNode ret = two.addTwoNumbers(l, r);
		while(ret != null) {
			System.out.println(ret.val);
			ret = ret.next;
			
		}
	}
	
}
