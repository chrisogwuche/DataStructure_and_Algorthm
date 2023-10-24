package org.example.sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int arr[]){
        int size = arr.length;

        for(int i =0; i< size-1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j =i; j<size; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(min != arr[i]){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]){
        int arr[] = {1,-3,8,23,34,0,34};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr);
    }

}
