public class OddIndices {
    public int[] oddIndices(int[] array) {
        if (array != null && array.length > 0) {
            int j = 0;
            int[] newArray = new int[array.length / 2];
            for (int i = 1; i < array.length; i += 2) {
                newArray[j] = array[i];
                j++;
            }

            return newArray;
        }

        return new int[0];
    }
}
