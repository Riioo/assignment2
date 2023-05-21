package assignment2;

import java.util.HashSet;

public class q6 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 5 };
        int[] array2 = { 3, 1, 5 };

        boolean isSubset = isSubset(array1, array2);
        if (isSubset) {
            System.out.println("Array2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }

    public static boolean isSubset(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of array1 to the set
        for (int num : array1) {
            set.add(num);
        }

        // Check if all elements of array2 are present in the set
        for (int num : array2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

}
