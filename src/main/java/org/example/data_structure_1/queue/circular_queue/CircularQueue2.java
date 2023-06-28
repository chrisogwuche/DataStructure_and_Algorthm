package org.example.data_structure_1.queue.circular_queue;

import java.util.ArrayList;
import java.util.Arrays;


public class CircularQueue2 {

    int front;
    int rear;
   ArrayList<Integer> array;
    int size;

    public CircularQueue2(int size){
      front = -1;
      rear = -1;
      this.size = size;
      this.array = new ArrayList<>(size);
    }

    public boolean isEmpty(){
       return front == -1;
    }

    public boolean isFull(){
        return (front == 0 && rear == size-1
                || rear == front -1);
    }

    void enQueue(int x){
        if(isFull()){
            System.out.println("queue is full");
            System.exit(-1);
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        array.add(rear,x);
    }

    int deQueue(){
        int x;
        if(isEmpty()){
            System.out.println("queue is empty");
            System.exit(-1);
        }
        x = array.get(front);
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else {
            front = (front + 1) % size;
        }
        return x;
    }

    void display(){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }

    public static void main(String[] args) {

        CircularQueue2 circularQueue2 = new CircularQueue2(5);

        System.out.println("isEmpty: " +circularQueue2.isEmpty());
        System.out.println("isFull: " +circularQueue2.isFull());

        circularQueue2.enQueue(1);
        circularQueue2.enQueue(2);
        circularQueue2.enQueue(3);
        circularQueue2.enQueue(4);
        circularQueue2.enQueue(5);

        circularQueue2.display();


        System.out.println(" dequeued element: " + circularQueue2.deQueue());
        System.out.println(" dequeued element: " + circularQueue2.deQueue());
        System.out.println(" dequeued element: " + circularQueue2.deQueue());
        System.out.println(" dequeued element: " + circularQueue2.deQueue());
        System.out.println(" dequeued element: " + circularQueue2.deQueue());
//        System.out.println(" dequeued element: " + circularQueue2.deQueue());
//        circularQueue2.display();

//        circularQueue2.enQueue(6);

        circularQueue2.display();

    }

}
