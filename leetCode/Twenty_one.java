package leetCode;


public class Twenty_one {

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
	
	public ListNode reverseNode(ListNode node) {
		ListNode cur = node, pre = null, next = null;
		while(cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode next = null, first = null;
        while(l1 != null && l2 != null) {
        	next = first;
        	if(l1.val < l2.val) {
        		first = new ListNode(l1.val);
        		l1 = l1.next;
        	}  else {
        		first = new ListNode(l2.val);
        		l2 = l2.next;
        	}
        	first.next = next;
        }
        while(l1 != null) {
        	next = first;
        	first = new ListNode(l1.val);
        	first.next = next;
        	l1 = l1.next;
        }
        while(l2 != null) {
        	next = first;
        	first = new ListNode(l2.val);
        	first.next = next;
        	l2  = l2.next;
        }
        return reverseNode(first);
    }
	
	public static void main(String [] args) {
		int a[] = {1, 2, 4}, b[] = {1, 3, 4};
		ListNode n1 = create(a), n2 = create(b);
		Twenty_one t = new Twenty_one();
		ListNode ret = t.mergeTwoLists(n1, n2);
		while(ret != null) {
			System.out.println(ret.val);
			ret = ret.next;
		}
	}
}
