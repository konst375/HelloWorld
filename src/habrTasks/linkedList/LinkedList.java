package habrTasks.linkedList;

public class LinkedList<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public LinkedList() {
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    private void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;

        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public boolean add(int index, E e) {
        checkIndex(index);

        if (index == size) {
            linkLast(e);
        } else {
            linkBefore(e, node(index));
        }
        return true;
    }

    private Node<E> node(int index) {
        if (index > (size >> 1)) {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        } else {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        }
    }

    private void linkBefore(E elToLink, Node<E> e) {
        Node<E> afterIt = e.prev;
        Node<E> newNode = new Node<>(afterIt, elToLink, e);
        e.prev = newNode;

        if (afterIt == null)
            first = newNode;
        else
            afterIt.next = newNode;
        size++;
    }

    private void checkIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException();
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    public E get(int index) {
        checkIndex(index);
        return node(index).element;
    }

    public E remove(int index) {
        checkIndex(index);
        return unLink(node(index));
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null) {
                    unLink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element.equals(o)) {
                    unLink(x);
                    return true;
                }
            }
        }
        return false;
    }

    private E unLink(Node<E> e) {
        E removedElement = e.element;
        Node<E> next = e.next;
        Node<E> prev = e.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            e.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }

        e.element = null;
        size--;
        return removedElement;
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
