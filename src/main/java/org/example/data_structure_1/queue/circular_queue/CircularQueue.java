package org.example.data_structure_1.queue.circular_queue;

public class CircularQueue {
    int size;
    int front;
    int rear;
    int items[];

    CircularQueue(int size){
        this.size = size;
        this.items = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    boolean isFull(){
        if(front == 0 && rear == size-1){
            return true;
        }
        // when rear has circled through the array. For instance when rear is at index 3 and front is at index 4;
        if(front == rear+1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        return front == -1;
    }

    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            if(front == -1){
                front= 0;
            }
            rear = (rear + 1) % size;
            items[rear] = element;
            System.out.println("Inserted " +element);
        }
    }

    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        // Fails because front = -1
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        q.display();

        int elem = q.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        q.display();

        q.enQueue(7);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
    }

}
