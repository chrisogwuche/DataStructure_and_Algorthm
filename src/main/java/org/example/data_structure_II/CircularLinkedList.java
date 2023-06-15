package org.example.data_structure_II;

public class CircularLinkedList {

    Node head;
    Node tail;

    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            next = null;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cLinked = new CircularLinkedList();

        cLinked.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        cLinked.tail = new Node(4);

        cLinked.head.next = second;
        second.next = third;
        third.next = cLinked.tail;
        cLinked.tail.next = cLinked.head;


        // using  while(cLinked.head !=null) without an index bound condition will give an infinity loop because they are all connected
        int  i = 6;
        while(i > 0){
            System.out.println("values : " +cLinked.head.value);
            cLinked.head = cLinked.head.next;
            i--;
        }
    }
}
