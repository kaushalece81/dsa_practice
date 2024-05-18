package scaler.dsa.day13.homework.string;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {
    public static int colorful(int A) {
        // Convert the number to a string to extract its digits
        String number = String.valueOf(A);
        int length = number.length();

        // Set to store the products of digit subsequences
        Set<Integer> products = new HashSet<>();

        // Iterate through all possible digit subsequences
        for (int i = 0; i < length; i++) {
            int product = 1;
            for (int j = i; j < length; j++) {
                // Calculate the product of the digits in the subsequence
                product *= Character.getNumericValue(number.charAt(j));
                // If the product is already present in the set, return 0 (not colorful)
                if (products.contains(product)) {
                    return 0;
                }
                // Add the product to the set
                products.add(product);
            }
        }

        // If all products are unique, return 1 (colorful)
        return 1;
    }

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Is " + number + " a colorful number? " + colorful(number));
    }
}