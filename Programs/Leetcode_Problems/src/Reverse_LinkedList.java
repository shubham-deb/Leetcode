class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data){
		this.data = data;
	}
}


public class Reverse_LinkedList {

    public ListNode reverseList(ListNode head) {
    	ListNode prev=null;
    	ListNode current = head;
    	ListNode next = null;
    	
    	while(current!=null){
    		next = current.next;
    		current.next = prev;
    		prev = current;
    		current = next;
    	}
    	
    	return prev;
    }
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		
		Reverse_LinkedList obj = new Reverse_LinkedList();
		
		ListNode rev = obj.reverseList(node);
		
		while(rev!=null){
			System.out.print(rev.data+"-->");
			rev = rev.next;
		}
	}

}
