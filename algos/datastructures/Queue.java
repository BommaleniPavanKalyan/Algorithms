package algos.datastructures;

public class Queue {
	
	private Node first = null; 
	private int count = 0;
	public void push(Object e) {
		if(first == null) {
			first = new Node(e,null);
			count++;
			return;
		}
		Node curr =first;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = new Node(e,null);
		count++;
	}
	public int size(){
		return count;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public Object peek() {
		if(first == null) return null;
		return first.ele;
	}
	public Object poll() {
		if(first == null) return null;
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
	}

}
