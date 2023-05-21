package assignment2;

public class q1 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 1 };

        q1(array);
    }

    public static void q1(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }
    }
}
