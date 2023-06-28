package org.example.data_structure_1.queue.priortyqueue;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue3 {
    int age;
    public PriorityQueue3(int age){
        this.age = age;
    }

    public int getAge(){
        return  age;
    }

    @Override
    public String toString() {
        return "PriorityQueue3{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue<PriorityQueue3> queue = new PriorityQueue<>(new PriorityQueue3Comparator());

        PriorityQueue3 element1 = new PriorityQueue3(20);
        PriorityQueue3 element2 = new PriorityQueue3(30);
        PriorityQueue3 element3 = new PriorityQueue3(5);

        queue.add(element1);
        queue.add(element2);
        queue.add(element3);

        System.out.println("i am peeking: " +queue.peek().toString());

        while(!queue.isEmpty()){
            System.out.println(queue.poll().age);
        }
    }
}

class PriorityQueue3Comparator implements Comparator<PriorityQueue3>{
    @Override
    public int compare(PriorityQueue3 o1, PriorityQueue3 o2) {
        if(o1.getAge() > o2.getAge())
            return -1;
        if(o1.getAge() < o2.getAge())
            return 1;
        return 0;
    }
}
