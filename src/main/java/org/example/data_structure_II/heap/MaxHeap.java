package org.example.data_structure_II.heap;

import java.util.ArrayList;

public class MaxHeap {

    static ArrayList<Integer> arr = new ArrayList<>();

    void heapifyi(ArrayList<Integer> arrl, int i){
        int size = arrl.size();

        int largest = i;
        int ln = 2 * i + 1;
        int rn =  2 * i + 2;

        if(ln < size && arrl.get(ln)> arrl.get(largest)){
            largest = ln;
        }
        if(rn < size && arrl.get(rn) > arrl.get(largest)){
            largest = rn;
        }

        if(largest != i){
            int temp = arrl.get(largest);
            arrl.set(largest, arrl.get(i));
            arrl.set(i,temp);

//            heapifyi(arrl,largest);
        }


    }


    void insert(ArrayList<Integer> arrl, int value){

        if(arrl.size() == 0){
            arrl.add(value);
        }
        else {
            arrl.add(value);
            for(int i = (arrl.size()/2)-1; i >=0; i-- ){
                heapifyi(arrl,i);
            }
        }
    }


    public static void main(String[] args) {
        MaxHeap maxHeap= new MaxHeap();
//
//        arr.add(2);
//        arr.add(6);
//        arr.add(9);
//        arr.add(5);
//        arr.add(4);
//        arr.add(10);
//        arr.add(12);

        maxHeap.insert(arr,2);
        maxHeap.insert(arr,6);
        maxHeap.insert(arr,9);
        maxHeap.insert(arr,5);
        maxHeap.insert(arr,4);
        maxHeap.insert(arr,10);
        maxHeap.insert(arr,12);



//        int nln = arr.size();
//        while(nln >= 0){
//            maxHeap.heapifyi(arr,nln);
//            nln --;
//        }

        System.out.println(arr.toString());

    }
}
