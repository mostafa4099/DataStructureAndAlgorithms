package DataStructure.Linear.List.SinglyLinkedList;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.security.InvalidParameterException;
import java.util.EmptyStackException;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.List.SinglyLinkedList.SinglyLinkedList.java: DataStructureAndAlgorithms
 * @CreationDate 11/29/2022 2:01 PM
 */
public class SinglyLinkedList {
    Node head;

    /**
     * display all element of list
     */
    public void show() {
        Node currentNode = this.head;

        while (null != currentNode) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    /**
     * display all element of list
     */
    public int length() {
        int ctr = 0;
        Node currentNode = this.head;

        while (null != currentNode) {
            ctr++;
            currentNode = currentNode.next;
        }
        return ctr;
    }

    /**
     * insert new item at the beginning of list
     * create new node and assign previous head to the new node's next and assign new node in head of the list
     *
     * @param data
     */
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    /**
     * insert new item at the end the of list
     * @param data
     */
    public void insertLast(int data) {
        Node newNode = new Node(data);

        //if head node not null, traverse and find last node to make chain with new node.
        //if head is null, add new node in head.
        if (null != this.head) {
            Node currentNode = this.head;

            while (null != currentNode.next) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        } else {
            this.head = newNode;
        }
    }

    /**
     * insert new item at index position of the list
     * @param data
     */
    public void insert(int data, int index) {
        if(index<0){
            throw new InvalidParameterException("Index should be greater than 0");
        }

        if(index > this.length()){
            throw new IndexOutOfBoundsException("Invalid List index.");
        }

        Node newNode = new Node(data);

        if(index == 0){
            // if provided index 0, insert data into head node and reindex previous head.
            newNode.next = this.head;
            this.head = newNode;
        } else {
            int ctr = 0;
            Node previousNode = this.head;

            //find out index-1 position node
            while (ctr < index -1) {
                previousNode = previousNode.next;
                ctr++;
            }

            //get provided index position's node
            Node currentNode = previousNode.next;

            //place provided index position node after new node and make chain
            newNode.next = currentNode;

            //place new node in index position and make chain with previous node
            previousNode.next = newNode;
        }
    }

    /**
     * remove first/head node of list and reassign head node
     * @return deleted node
     */
    public Node removeFirst() {
        if(null == this.head){
            throw new RuntimeException("Empty list");
        }
        Node removedNode = head;
        this.head = head.next;

        return removedNode;
    }

    /**
     * remove last node of list
     * @return deleted node
     */
    public Node removeLast() {
        Node currentNode = this.head;

        if(null == currentNode){
            throw new RuntimeException("Empty list");
        }

        //if list contain only one item
        if(null == currentNode.next){
            this.head = null;
            return currentNode;
        }

        //find out previous node of last node and remove chain with it.
        Node previousNode = null;
        while (null != currentNode.next){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        //break chain
        previousNode.next = null;

        return currentNode;
    }
}
