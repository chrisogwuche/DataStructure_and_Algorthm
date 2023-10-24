package org.example.sorting_algorithms.quick_sort;
import java.util.*;
public class QuickSort2 {

    static int partitionArray(int arr[], int low, int high){
        int i = low;
        int pivot = arr[high];

        for(int j = low; j< high; j++){

            if(arr[j]<= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp= arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    static void quickSort(int arr[], int low, int high){
        if(low< high){

            int i = partitionArray(arr,low,high);

            quickSort(arr,low,i-1);
            quickSort(arr,i+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,3,6,2,0,8,5,3,6,123,3432,343,34,35,462,6876,5475476,76767,878,8779,989,80,90,909,7,88,6787,6867,56,65,5,4,454545,6576,765656786,77,878,87,7687,76765,5,56,56,456676,65566};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
