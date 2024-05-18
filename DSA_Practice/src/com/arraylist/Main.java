package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        for(int i=0;i<101;i++) {
        	 list.add(i);
        }
        list.ensureCapacity(200);
        System.out.println("Size before removal: " + list.size());  // Output: 5
     // Check the capacity of the ArrayList
        int capacity = ((Object[]) list.toArray()).length;
        System.out.println("Capacity of the ArrayList: " + capacity);

        // Removing elements
        for(int i=0;i<50;i++) {
       	 list.remove(i);
       }

        System.out.println("Size after removal: " + list.size());  // Output: 3

        // Printing capacity after removal
         capacity = ((Object[]) list.toArray()).length;
        System.out.println("Capacity of the ArrayList: " + capacity);

        // Trimming the capacity
        list.trimToSize();
        // Printing capacity after trimming
         capacity = ((Object[]) list.toArray()).length;
        System.out.println("Capacity of the ArrayList: " + capacity);
    }
}