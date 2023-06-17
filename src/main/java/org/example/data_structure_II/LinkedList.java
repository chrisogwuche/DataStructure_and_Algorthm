package org.example.data_structure_II;

public class LinkedList {

    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }

        //-------------------------------------------------------------------//

        LinkedList linked = new LinkedList();
        linked.head = new Node(2);
        Node sec = new Node(5);
        Node thr = new Node(7);

        sec.next = thr;

        linked.head.next = sec;

        while(linked.head.next != null){
            System.out.println("i am the value of linked " +linked.head.value);
            linked.head = linked.head.next;
        }
    }
}


