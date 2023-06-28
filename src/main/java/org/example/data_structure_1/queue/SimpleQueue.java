package org.example.data_structure_1.queue;

public class SimpleQueue {

    private int size;
    private int rear;
    private int front;
    private int items[];

    SimpleQueue(int size){
        this.size = size;
        items = new int[size];
        rear = -1;
        front = -1;
    }

    boolean isFull(){
        if(front == 0 && rear == size-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        return front == -1;
    }

    void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            System.exit(-1);
        }
        else {
            if(front == -1) {
                front = 0;
            }
            rear++;
            System.out.println(" rear: " +rear);
            items[rear] = x;
        }
    }

    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.exit(-1);
            return (-1);
        }
        else{
            element = items[front];
            if(front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("Deleted element: " +element);
            return element;
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        else{
            for(int i = front; i<= rear; i++){
                System.out.println(items[i]);
            }
        }
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.display();

        q.deQueue();

        q.display();
    }
}
