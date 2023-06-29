package org.example.data_structure_II.circular_linkedlist;


public class CircularLinkedList2 {
    Node head;
    Node tail;
    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    public static Node insertAtFirst(Node n, int value){
        Node temp = new Node(value);
        temp.next = n;

        return temp;
    }

    public static Node insertAtLast(Node head, int value){
        Node n = new Node(value);
         while(head.next != null){
             head = head.next;
         }

         head.next = n;
         System.out.println("inserted");

        return head;
    }

    public static Node insertWithIn(Node head, int value, int index){
        Node newNode = new Node(value);
        Node temp = head;

        //since I am want to insert a Node in a certain index. I will subtract the index by 2.
        int k = index - 2;

        while (0 < k){
            temp = temp.next;
            k--;
        }
        System.out.println("temp after the loop is : " +temp.value);
        Node n = temp.next;

        temp.next = newNode;

        newNode.next = n;

        return temp;
    }

    public static void main(String[] args) {
        CircularLinkedList2 c = new CircularLinkedList2();
        c.head = new Node(2);
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        c.tail = new Node(5);

        c.head.next = n1;
        n1.next = n2;
        n2.next = c.tail;

        Node t = c.head;
        while(t != null){
            System.out.println("nodes value: "+ t.value);
            t = t.next;
        }
//
//        Node temp = insertAtFirst(c.head, 1);
//        while(temp != null){
//            System.out.println("nodes value: "+ temp.value);
//            temp = temp.next;
//        }
//
//        Node s = insertAtLast(c.head, 6);
//        while (s != null){
//            System.out.println("insertion: " +s.value);
//            s = s.next;
//        }

        Node k = insertWithIn(c.head,77,3);
        while(k != null){
            System.out.println("insertWithIn: " +k.value);
            k = k.next;
        }
    }

}
