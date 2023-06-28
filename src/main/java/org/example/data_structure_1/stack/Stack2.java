package org.example.data_structure_1.stack;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] arg){

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("the first element in the stack is: " +stack.peek());
        System.out.println("shows the first element add to the stack which is " +stack.firstElement());

        System.out.println(stack);

        // Search returns the index i.e (1,2,3,4,5) has a stack index of (5,4,3,2,1) respectively
        // 5 has index 1 since is the first element to be pop
        System.out.println("This is search of 5: " +stack.search(5));
        System.out.println("This is search of 1: " +stack.search(1));


        System.out.println(stack.pop() +" is popped");
        // since 5 has been popped from the stack, it search index will be -1 (false/not found)
        System.out.println("This is search of 5: " +stack.search(5));

        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }

}
