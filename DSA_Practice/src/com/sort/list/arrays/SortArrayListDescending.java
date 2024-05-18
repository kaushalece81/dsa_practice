package com.sort.list.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListDescending {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 3, 8, 2, 7));

        descendingOrder(list);
        
        ascendingOrder(list);
    }

	private static void ascendingOrder(List<Integer> list) {
		// Sort the ArrayList in ascending order
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in ascending order: " + list);
	}

	private static void descendingOrder(List<Integer> list) {
		// Sort the ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + list);
	}
}