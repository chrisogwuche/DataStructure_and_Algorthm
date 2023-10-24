package org.example.sorting_algorithms;

import java.util.*;
public class InsertionSort {

    public void insertionSort(int arr[]){
        int size = arr.length;

        for(int i =1; i< size;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key< arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]){
        InsertionSort i = new InsertionSort();
        int arr[] = {32,4,4,3,9,6,-1};
        i.insertionSort(arr);
    }
}
