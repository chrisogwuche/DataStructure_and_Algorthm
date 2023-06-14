package org.example.data_structure_II;

public class DoublyLinkedList {
    Node head;

    static class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
            next = null;
            prev = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dLinked = new DoublyLinkedList();
        dLinked.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        dLinked.head.next = second;
        second.prev = dLinked.head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        while (dLinked.head != null){
            System.out.println("forward display: " +dLinked.head.value);
            dLinked.head = dLinked.head.next;
        }

        System.out.println("\n");

        while (fourth != null){
            System.out.println("backward display: " +fourth.value);
            fourth = fourth.prev;
        }

    }

}
