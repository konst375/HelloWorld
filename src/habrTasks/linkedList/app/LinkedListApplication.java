package habrTasks.linkedList.app;

import habrTasks.linkedList.LinkedList;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(3);
        integerLinkedList.add(1, 2);
        System.out.println(integerLinkedList.get(2));
        System.out.println(integerLinkedList.remove(0));
        System.out.println(integerLinkedList.remove(Integer.valueOf(3)));
    }
}
