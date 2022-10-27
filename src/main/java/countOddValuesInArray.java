public class countOddValuesInArray {

    public int countEvenValuesInArray(int[] array) {

        int count = 0;
        if (array.length == 0) {

            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int countOddValuesInArray(int[] array) {

        if (array.length == 0) {

            return -1;
        }

        return array.length - countEvenValuesInArray(array);
    }
}
