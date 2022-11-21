package DataStructure.Linear;

public class StackBasicOperation {
    
    int max, top;
    Object stk[];

    public StackBasicOperation() {
        max = 100;
        stk = new Object[max];
        top = -1;
    }
    
    boolean isEmpty () {
        return top<0;
    }
    
    int size(){
        return top+1;
    }
    
    Object push(Object element){
        if (top>=(max-1)) {
            System.out.println("Stack Over Flow");
            return null;
        } else {
            stk [++top] = element;
            System.out.println(element+" added successfully");
            return element;
        }
    }
    
    Object peek(){
        if (top<0) {
            System.out.println("Stack Under Flow");
            return null;
        } else {
            Object e = stk[top];
            System.out.println(e+ " is peeked");
            return e;
        }
    }
    
    Object pop(){
        if (top<0) {
            System.out.println("Stack Under Flow");
            return null;
        } else {
            Object e = stk[top--];
            System.out.println(e+ " is removed");
            return e;
        }
    }

    public static void main(String[] args) {
        
        StackBasicOperation stack = new StackBasicOperation();
        
        System.out.println("Stack is empty - "+stack.isEmpty());
        System.out.println("Stack size - "+stack.size());
        
        stack.push("Mostafa");
        stack.push(29);
        stack.push(true);
        
        stack.pop();
        stack.peek();
    }
}
