package DataStructure.Linear;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        int n, size, capacity;
//        Queue Declaration
        Queue q = new LinkedList();
        size = q.size();
        System.out.println("Before Enqueue, Queue : "+q);
        System.out.println("Before Enqueue, Queue Size: "+size);
//        Enqueue operation
        for (int i = 0; i < 5; i++) {
            int num = (int) Math.round(Math.random()*1000);
            //q.add(num);
            q.offer(num);
        }
        size = q.size();
        System.out.println("After Enqueue, Queue: "+q);
        System.out.println("After Enqueue, Queue Size: "+size);
//        peek operation
        n = (int) q.peek();
        System.out.println("After Peek "+n+" Queue: "+q);
//        dequeue operation 
        int len = size;
        for (int i = 1; i <= len; i++) {
            n = (int) q.poll();
            //n = (int) q.remove();
            System.out.println("After Dequeue "+n+" Queue: "+q);
        }
    }
}
