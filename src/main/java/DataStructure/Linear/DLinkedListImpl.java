package DataStructure.Linear;

public class DLinkedListImpl {
    Node head, tail;
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = tail = newNode;
            head.prev = head.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void show() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }
    public static void main(String[] args) {
        DLinkedListImpl list = new DLinkedListImpl();
        list.insert(5);
        list.insert(7);
        list.insert(12);
        list.insert(17);
        list.show();
    }
    class Node {
        int data;
        Node next;
        Node prev;
    }
}
