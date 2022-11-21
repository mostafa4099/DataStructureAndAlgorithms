package DataStructure.Linear;

public class LinkedListImplementation {
    Node head, tail;
    public void insert(int data) {
//        create new node
        Node newNode = new Node();
//        add data in node
        newNode.data = data;
        newNode.next = null;
//        head checking
        if (head == null) {
            head = tail = newNode;
        } else {
//            store new node reference in previous node
            tail.next = newNode;
//            update previous tail with new node
            tail = newNode;
        }
    }
    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
//        store previous head as new next in new node
        newNode.next = head;
//        store new first node as head
        head = newNode;
    }
    public void insertAt(int index, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (index == 0) {
            insertAtFirst(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
        }
    }
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head, n1=null;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            n1 = currentNode.next;
            currentNode.next = n1.next;
//            n1 = null;
            System.out.println("Deleted Item "+n1.data);
            n1 = null;
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
        LinkedListImplementation list = new LinkedListImplementation();
        list.insert(5);
        list.insert(7);
        list.insert(12);
        list.insert(17);
        list.insertAtFirst(2);
        list.insertAt(0, 15);
        list.show();
        list.deleteAt(2);
        list.show();
    }
    class Node {
        int data;
        Node next;
    }
}
