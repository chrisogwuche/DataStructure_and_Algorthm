package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OtherAlgorithms {

    public static void main(String arg[]){
        hashMapAlgorithm();
        arrayListAlgorithm();

    }

    public static void hashMapAlgorithm(){

        System.out.println("from hashMapAlgorithm");

        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("first",1);
        hashMap.put("second",2);
        hashMap.put("third",3);
        hashMap.put("fourth",4);
        hashMap.put("fifth",5);

        System.out.println(hashMap);

        for(HashMap.Entry<String,Integer> map: hashMap.entrySet()){

            System.out.println("key: " +map.getKey());
            System.out.println("value: "+map.getValue());
        }

        System.out.println("\nFOR EACH LAMBDA METHOD");

        hashMap.forEach((key,value)->{
            System.out.println("key: " +key);
            System.out.println("value: " +value);
        });

        System.out.println("\n");
    }

    public static void arrayListAlgorithm(){

        System.out.println("from arrayListAlgorithm");

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for(Integer a: arrayList){
            System.out.println("values: " +a);
        }

        System.out.println("\n");
    }
}
