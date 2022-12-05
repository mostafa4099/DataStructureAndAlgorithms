package DataStructure.Linear.List.SinglyLinkedList;

import java.util.LinkedList;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.List.SinglyLinkedList.Main.java: DataStructureAndAlgorithms
 * @CreationDate 11/29/2022 2:02 PM
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
//        list.head = new Node(10); //head node
//
//        Node secondNode = new Node(12);
//        Node thirdNode = new Node(8);
//        Node fourthNode = new Node(6);
//        Node fifthNode = new Node(14);

        //Making chain. Connect to previous node.
//        list.head.next = secondNode; //10-->12
//        secondNode.next = thirdNode; //10-->12-->8
//        thirdNode.next = fourthNode; //10-->12-->8-->6
//        fourthNode.next = fifthNode; //10-->12-->8-->6-->14
//        fifthNode.next = null; //10-->12-->8-->6-->14-->null

        //print singly link list
//        list.show();

        //get length of singly link list
//        System.out.println(list.length());

        //insert beginning of the list
//        list.insertFirst(7);
//        list.show();

        //insert end of the list
//        list.insertLast(7);

        list.insertFirst(8);
        list.insertLast(4);
        list.insertLast(5);
        list.insert(6, 1);
        list.removeFirst();
        list.removeLast();
        list.show();
    }
}
