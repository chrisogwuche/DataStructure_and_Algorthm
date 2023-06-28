package org.example.data_structure_1.queue.priortyqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 implements Comparable<PriorityQueue2>{
    int x;

    public PriorityQueue2(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
    @Override
    public int compareTo(PriorityQueue2 o) {
        if(this.x > o.getX())
            return  -1;  // if the prev is greater than the incoming value do not swap
        if(this.x < o.getX())
            return 1;  // if the prev is less than the incoming value do swap

        return 0; // if they are equal no action will be taken
    }

    @Override
    public String toString() {
        return "PriorityQueue2{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] arg){
        // By default, PriorityQueue will always sort in ascending order
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(1);
        integerQueue.add(3);
        integerQueue.add(6);
        integerQueue.add(4);
        integerQueue.add(2);

        while(!integerQueue.isEmpty()){
            System.out.println("Default PriorityQueue: " +integerQueue.poll().toString());
        }

        PriorityQueue2 element1 = new PriorityQueue2(1);
        PriorityQueue2 element2 = new PriorityQueue2(5);
        PriorityQueue2 element3 = new PriorityQueue2(3);

        PriorityQueue<PriorityQueue2> queue = new PriorityQueue<>();
        queue.add(element1);
        queue.add(element2);
        queue.add(element3);

        while(!queue.isEmpty()){
            System.out.println("Using comparable to sort based on priority: " +queue.poll().toString());
        }

    }
}
