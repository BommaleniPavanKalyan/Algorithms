package algos.datastructures;

class DNode {
    Object ele;
    DNode prev;
    DNode next;

    public DNode(Object e, DNode prev, DNode next) {
        this.ele = e;
        this.prev = prev;
        this.next = next;
    }
}

public class DoublyLinkedList {
    private DNode first;
    private DNode last;
    private int size;

    public void add(Object e) {
        if (first == null) {
            first = new DNode(e, null, null);
            last = first;
        } else {
            DNode newNode = new DNode(e, last, null);
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            DNode newNode = new DNode(e, null, first);
            if (first != null) {
                first.prev = newNode;
            }
            first = newNode;
            if (last == null) {
                last = first;
            }
        } else if (index == size) {
            add(e); // Adding at the end
        } else {
            DNode curr = getNode(index);
            DNode newNode = new DNode(e, curr.prev, curr);
            curr.prev.next = newNode;
            curr.prev = newNode;
        }
        size++;
    }

    public Object get(int index) {
        return getNode(index).ele;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        DNode curr = getNode(index);
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        } else {
            first = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        } else {
            last = curr.prev;
        }
        size--;
    }

    public int size() {
        return size;
    }

    private DNode getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        DNode curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }
}

