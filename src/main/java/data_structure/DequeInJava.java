package data_structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeInJava {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.add(80);
        System.out.println("After Add DequeArray: "+deque);
        deque.addFirst(78);
        System.out.println("After Add First DequeArray: "+deque);
        deque.addLast(82);
        System.out.println("After Add Last DequeArray: "+deque);
        deque.push(15);//push work as like addFirst
        System.out.println("After Push DequeArray: "+deque);
        deque.offer(22);
        System.out.println("After Offer DequeArray: "+deque);
        deque.offerFirst(20);
        System.out.println("After Offer First DequeArray: "+deque);
        deque.offerLast(24);
        System.out.println("After Offer Last DequeArray: "+deque);
        
        Iterator iterator = deque.iterator();
        System.out.print("Deque Elements:");
        while (iterator.hasNext()) {
            System.out.print(" "+iterator.next());
        }
        System.out.println();
        
        Iterator deIterator = deque.descendingIterator();
        System.out.print("Deque Descending Elements:");
        while (deIterator.hasNext()) {
            System.out.print(" "+deIterator.next());
        }
        System.out.println();
        
        System.out.println("After peek "+deque.peek()+" deque "+deque);
        System.out.println("After peek first "+deque.peekFirst()+" deque "+deque);
        System.out.println("After peek last "+deque.peekLast()+" deque "+deque);
        System.out.println("Contain element: "+deque.contains(15));
        
        deque.poll();
        System.out.println("After Poll DequeArray: "+deque);
        deque.pollFirst();
        System.out.println("After Poll First DequeArray: "+deque);
        deque.pollLast();
        System.out.println("After Poll Last DequeArray: "+deque);
        deque.remove();
        System.out.println("After Remove DequeArray: "+deque);
        deque.removeFirst();
        System.out.println("After Remove First DequeArray: "+deque);
        deque.removeLast();
        System.out.println("After Remove Last DequeArray: "+deque);
    }
}
