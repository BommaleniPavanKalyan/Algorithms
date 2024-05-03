package algos.datastructures;

import java.util.EmptyStackException;

public class Stack {
	private Node first =null;
	private int count = 0;
	 public void push(Object e) {
		 if(first == null) {
			 first = new Node(e,null);
			 count++;
			 return;
		 }
		 first = new Node(e,first);
		 count++;
	 }
	 public int size() {
		 return count;
	 }
	 public boolean isEmpty() {
		 return first == null;
	 }
	 public Object pop() {
		 if(isEmpty()) {
			 throw new EmptyStackException();
		 }
		 Object ele = first.ele;
		 first = first.next;
		 count--;
		 return ele;
	 }
}
