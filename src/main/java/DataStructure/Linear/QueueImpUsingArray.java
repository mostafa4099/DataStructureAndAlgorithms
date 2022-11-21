package DataStructure.Linear;

public class QueueImpUsingArray {
    int max = 10;
    int index;
    int arr [] = new int[max];
    Object enQueue(int a){
        if(index==max-1){
            System.out.println("Queue Full");
            return 0;
        } else{
            arr[index] = a;
            index++;
            System.out.println(a+" enqueue into Queue");
            return a;
        }
    }
    boolean isEmpty(){
        return index==0;
    }
    int size(){
        return index;
    }
    Object deQueue(){
        if(isEmpty()) {
            System.out.println("Queue Empty.");
            return 0;
        } else {
            int x = arr[0];
            for (int i = 0; i < index-1; i++) {
                arr[i] = arr[i+1];
            }
            index--;
            System.out.println(x+" dequeue from Queue");
            return x;
        }
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue Empty.");
            return 0;
        } else {
            int x = arr[0];
            System.out.println("Peek value: "+x);
            return x;
        }
    }
    public static void main(String[] args) {
        QueueImpUsingArray queue = new QueueImpUsingArray();
        System.out.println("Is queue empty: "+queue.isEmpty());
        System.out.println("Queue Size: "+queue.size());
        queue.enQueue(89);
        queue.enQueue(98);
        queue.enQueue(52);
        System.out.println("Is queue empty: "+queue.isEmpty());
        System.out.println("Queue Size: "+queue.size());
        queue.peek();
        System.out.println("Is queue empty: "+queue.isEmpty());
        System.out.println("Queue Size: "+queue.size());
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("Is queue empty: "+queue.isEmpty());
        System.out.println("Queue Size: "+queue.size());
    }
}
