package algos.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Set<T> {
    private List<T> elements;

    public Set() {
        elements = new ArrayList<>();
    }

    public boolean add(T element) {
        if (!contains(element)) {
            elements.add(element);
            return true;
        }
        return false;
    }

    public boolean remove(T element) {
        return elements.remove(element);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        elements.clear();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public Set<T> union(Set<T> otherSet) {
        Set<T> unionSet = new Set<>();
        unionSet.elements.addAll(this.elements);
        for (T element : otherSet.elements) {
            if (!this.contains(element)) {
                unionSet.add(element);
            }
        }
        return unionSet;
    }

    public Set<T> intersection(Set<T> otherSet) {
        Set<T> intersectionSet = new Set<>();
        for (T element : this.elements) {
            if (otherSet.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }

    public Set<T> difference(Set<T> otherSet) {
        Set<T> differenceSet = new Set<>();
        for (T element : this.elements) {
            if (!otherSet.contains(element)) {
                differenceSet.add(element);
            }
        }
        return differenceSet;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

