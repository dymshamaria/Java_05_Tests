public class ManipulationsWithArrays {

    public int[] multiplyArrayByNumber(int[] array, int number) {

        int[] arrayOfProducts = new int[array.length];

        if (number == 0) {

            return arrayOfProducts;
        }
        if (array.length == 0) {

            return new int[0];
        }

        for (int i = 0; i < array.length; i++) {
            int product = array[i] * number;
            if (product / number == array[i]) {
                arrayOfProducts[i] = product;
            } else {
                return new int[0];
            }
        }

        return arrayOfProducts;
    }


    public double[] toDoubleArray(int[] array) {
        double[] arrayDouble = new double[array.length];

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayDouble[i] = array[i];
            }
        } else {

            return new double[0];
        }

        return arrayDouble;
    }


    public int[] toIntArray(double[] array) {

        int[] arrayInt = new int[array.length];

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayInt[i] = (int) array[i];
            }
        } else {

            return new int[0];
        }

        return arrayInt;
    }


    public String[] toStringArray(int[] array) {

        String[] arrayString = new String[array.length];

        if (array.length == 0) {

            return new String[0];
        }
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = "" + array[i];
        }

        return arrayString;
    }


    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        if (array.length == 0) {

            return false;
        }

        int countOfBiggerElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                countOfBiggerElements++;
            }
        }

        if (countOfBiggerElements == array.length) {

            return true;
        }

        return false;
    }
}
