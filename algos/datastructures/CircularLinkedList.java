package algos.datastructures;

class CNode {
    Object ele;
    CNode next;

    public CNode(Object e, CNode next) {
        this.ele = e;
        this.next = next;
    }
}

public class CircularLinkedList {
    private CNode head;
    private int size;

    public void add(Object e) { 
        if (head == null) {
            head = new CNode(e, null);
            head.next = head; // Circular reference
        } else {
            CNode newNode = new CNode(e, head.next);
            head.next = newNode;
        }
        size++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            CNode prev = getNode(index - 1);
            CNode newNode = new CNode(e, prev.next);
            prev.next = newNode;
            size++;
        }
    }

    public Object get(int index) {
        return getNode(index).ele;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            CNode prev = getNode(index - 1);
            prev.next = prev.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    private CNode getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        CNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    private void addFirst(Object e) {
        if (head == null) {
            head = new CNode(e, null);
            head.next = head; // Circular reference
        } else {
            CNode newNode = new CNode(e, head);
            CNode lastNode = getNode(size - 1);
            head = newNode;
            lastNode.next = head; // Update last node's next reference
        }
        size++;
    }

    private void addLast(Object e) {
        CNode lastNode = getNode(size - 1);
        CNode newNode = new CNode(e, head); // Circular reference
        lastNode.next = newNode;
        size++;
    }
}
