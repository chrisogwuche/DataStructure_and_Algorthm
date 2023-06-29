package org.example.data_structure_II.circular_linkedlist;

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
//        cLinked.tail.next = cLinked.head;


        // using  while(cLinked.head !=null) without an index bound condition will give an infinity loop because they are all connected
//        int  i = 6;
//        while(i > 0){
//            System.out.println("values : " +cLinked.head.value);
//            cLinked.head = cLinked.head.next;
//            i--;
//        }

        //INSERT AT FIRST
//        Node inserted = insertAtFirst(cLinked.head, 9);
//
//        while(inserted != null){
//            System.out.println("inserted at first function: " +inserted.value);
//            inserted = inserted.next;
//        }
//
        //INSERT AT LAST
//        Node x= insertAtLast(cLinked.head, 8);
//        while(x!= null){
//            System.out.println("inserted at first function: " +x.value);
//            x = x.next;
//        }


        //INSERT AFTER
//        Node x= insertAfter(cLinked.head, 8);
//        while(x!= null){
//            System.out.println("inserted at first function: " +x.value);
//            x = x.next;
//        }


        //INSERT DELETE NODE
        Node x= deleteNode(cLinked.head, 2);
        while(x!= null){
            System.out.println("inserted at first function: " +x.value);
            x = x.next;
        }


    }

    public static Node insertAtFirst(Node head, int value){
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertAtLast(Node head, int value){
       Node newNode = new Node(value);
       newNode.next = null;
       Node last = head;

       while (last.next != null){
           last = last.next;
       }
       last.next = newNode;

       return last;
    }

    public static Node insertAfter(Node head, int value){
        Node nextNode = new Node(value);

        nextNode.next = head.next;
        head. next = nextNode;
        return head;
    }

    public static Node deleteNode(Node head, int position){

        Node temp = head;

        for(int i=0; i <= position-2; i++){
            System.out.println("--" + temp.value);
            temp = temp.next;

        }
        Node n = temp.next.next;
        temp.next = n;

        return temp;
    }
}
