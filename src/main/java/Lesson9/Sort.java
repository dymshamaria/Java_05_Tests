package Lesson9;

public class Sort {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{};

        long start = 0;
        long end = 0;
        start = System.nanoTime();
        bubbleSort(array);
        end = System.nanoTime();

        System.out.println(end - start);
    }
}
