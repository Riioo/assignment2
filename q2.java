package assignment2;

public class q2 {
    public static void main(String[] args) {
        int[] array = { 2, 4, 3, 5, 1 };

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            if (array[i] > pivot && array[j] < pivot) {
                swap(array, i, j);
                i++;
                j--;
            } else if (array[i] <= pivot) {
                i++;
            } else if (array[j] >= pivot) {
                j--;
            }
        }

        swap(array, low, j);
        return j;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
