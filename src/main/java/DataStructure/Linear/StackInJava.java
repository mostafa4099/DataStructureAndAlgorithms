package DataStructure.Linear;

import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        int n, size, capacity;
//        Stack Declaration
        Stack stack = new Stack();
        size = stack.size();
        capacity = stack.capacity();
        System.out.println("Before Push, Stack : "+stack);
        System.out.println("Before Push, Stack Capacity: "+capacity);
        System.out.println("Before Push, Stack Size: "+size);
//        push operation
        for (int i = 0; i < capacity/2; i++) {
            int num = (int) Math.round(Math.random()*1000);
            stack.push(num);
        }
        size = stack.size();
        capacity = stack.capacity();
        System.out.println("After Push, Stack: "+stack);
        System.out.println("After Push, Stack Capacity: "+capacity);
        System.out.println("After Push, Stack Size: "+size);
//        peek operation
        n = (int) stack.peek();
        System.out.println("After Peek "+n+" stack: "+stack);
        int len = size;
//        pop operation
        for (int i = 1; i <= len; i++) {
            n = (int) stack.pop();
            size = stack.size();
            capacity = stack.capacity();
            System.out.println("After Pop "+n+" stack: "+stack);
            System.out.println("After Pop "+n+" capacity: "+capacity);
            System.out.println("After Pop "+n+" size: "+size);
        }
    }
}
