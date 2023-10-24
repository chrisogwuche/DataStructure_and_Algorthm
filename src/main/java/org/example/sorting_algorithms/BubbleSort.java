package org.example.sorting_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public void bubbleSort(int [] arr){
        int size = arr.length;

        for(int i =0; i < size; i++){
            boolean swapped = false;
            for(int j =0; j< size-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("The array" + Arrays.toString(arr));
    }

    public static void main(String arg[]){
        int arr[] = {1,3,56,7,-1,4};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
    }
}
