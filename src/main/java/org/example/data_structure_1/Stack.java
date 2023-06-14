package org.example.data_structure_1;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //add element into stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
       arr[++top] = x;
    }

    //remove elements from a stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("no element in stack");
            System.exit(-1);
        }
        return arr[top--];
    }

    boolean isFull(){
        return top == capacity-1;
    }

    boolean isEmpty(){
      return top == -1;
    }

    public int size(){
        return top+1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("element popped: " + stack.pop());
        System.out.println("---------------");
        stack.printStack();
    }
}
