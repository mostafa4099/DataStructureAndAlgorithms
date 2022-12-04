package DataStructure.Linear.List.SinglyLinkedList;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.List.SinglyLinkedList.Main.java: DataStructureAndAlgorithms
 * @CreationDate 11/29/2022 2:02 PM
 */
public class Main {
    public static void printSinglyLinkedList(SinglyLinkedList list){
        Node currentNode = list.head;

        while (null != currentNode){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new Node(10); //head node

        Node secondNode = new Node(12);
        Node thirdNode = new Node(8);
        Node fourthNode = new Node(6);
        Node fifthNode = new Node(14);

        //Making chain. Connect to previous node.
        list.head.next = secondNode; //10-->12
        secondNode.next = thirdNode; //10-->12-->8
        thirdNode.next = fourthNode; //10-->12-->8-->6
        fourthNode.next = fifthNode; //10-->12-->8-->6-->14
//        fifthNode.next = null; //10-->12-->8-->6-->14-->null

        //print singly link list
        printSinglyLinkedList(list);
    }
}
