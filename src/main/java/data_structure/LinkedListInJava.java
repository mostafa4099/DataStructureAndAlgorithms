package data_structure;

import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        int n, size, capacity;
//        Linked List Declaration
        LinkedList list = new LinkedList();
        size = list.size();
        System.out.println("Before Insert, Linked List : "+list);
        System.out.println("Before Insert, Linked List Size: "+size);
        System.out.println("Is Linked List Empty? "+list.isEmpty());
//        Insert operation
        list.push(6);
        list.add(8);
        list.addFirst(4);
        list.addLast(10);
        list.offer(12);
        list.offerFirst(2);
        list.offerLast(14);
        list.add(7, 16);
        size = list.size();
        System.out.println("After insert, Linked List: "+list);
        System.out.println("After insert, Linked List Size: "+size);
//        peek operation
        n = (int) list.peek();
        System.out.println("After Peek "+n+" Linked List: "+list);
        n = (int) list.peekFirst();
        System.out.println("After Peek First "+n+" Linked List: "+list);
        n = (int) list.peekLast();
        System.out.println("After Peek Last "+n+" Linked List: "+list);
//        delete operation 
        list.pop();
        System.out.println("After Pop Linked List: "+list);
        list.poll();
        System.out.println("After poll Linked List: "+list);
        list.pollFirst();
        System.out.println("After poll first Linked List: "+list);
        list.pollLast();
        System.out.println("After poll last Linked List: "+list);
        list.remove(2);
        System.out.println("After Remove 2 index Linked List: "+list);
        list.removeFirst();
        System.out.println("After remove first Linked List: "+list);
        list.removeLast();
        System.out.println("After remove last Linked List: "+list);
        list.remove();
        System.out.println("After remove Linked List: "+list);
    }
}
