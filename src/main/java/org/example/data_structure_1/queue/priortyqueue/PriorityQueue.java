package org.example.data_structure_1.queue.priortyqueue;

import java.util.ArrayList;

public class PriorityQueue {

    void heapify(ArrayList<Integer> arrayList, int i) {

        int size = arrayList.size();
        // Find the largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && arrayList.get(l) > arrayList.get(largest))
            largest = l;
        if (r < size && arrayList.get(r) > arrayList.get(largest))
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int temp = arrayList.get(largest);
            arrayList.set(largest, arrayList.get(i));
            arrayList.set(i, temp);

            heapify(arrayList, largest);  // recursive
        }
    }

    // Function to insert an element into the tree
    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(newNum);
        } else {
            hT.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }

    // Function to delete an element from the tree
    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }

        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);

        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }

    // Print the tree
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        PriorityQueue h = new PriorityQueue();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}
