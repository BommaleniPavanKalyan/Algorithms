package algos.datastructures;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list.get(5));
		list.add(5,2);
		System.out.println(list.get(5));
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size());
		
	}

}
