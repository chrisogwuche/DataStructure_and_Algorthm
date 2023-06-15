package org.example.data_structure_II;

import java.util.*;

class HashTable {
    public static void main(String args[]) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(123, 432);
        ht.put(12, 2345);
        ht.put(15, 5643);
        ht.put(3, 321);

        ht.remove(12);
        System.out.println(ht);

        System.out.println("----------------------------------------------------");

        Map<Integer, String> alphabet = new HashMap<>();
        alphabet.put(1,"a");
        alphabet.put(2,"b");
        alphabet.put(3,"c");
        alphabet.put(4,"d");
        alphabet.put(5,"e");

        for(Map.Entry<Integer,String> entry: alphabet.entrySet()){
            System.out.println("Key is :" +entry.getKey()  +" while the value is "+entry.getValue());
        }
    }
}
