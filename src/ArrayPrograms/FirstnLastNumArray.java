package ArrayPrograms;

import java.util.ArrayList;

public class FirstnLastNumArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] array1 = {4, 6, 8, 1, 9};

        // Create an ArrayList and add elements from array1
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        for (int i = 0; i < array1.length; i++) {
            list.add(array1[i]);
        }

        // Get the first element
        int first = list.get(0);

        // Get the last element
        int last = list.get(list.size() - 1);

        // Print the first and last elements
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}
