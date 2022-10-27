import org.testng.Assert;
import org.testng.annotations.Test;

public class countOddValuesInArrayTest {

    @Test
    public void testCountEvenNumbersInAnArray() {

        int[] array = {5, 67, 66, 45, 3, 8, 23, 40};
        int expectedResult = 3;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenNumbersWithZeroInAnArray() {

        int[] array = {5, 67, 66, 45, 3, 8, 0, 40};
        int expectedResult = 4;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenNumbersIncludingMinAndMaxInAnArray() {

        int[] array = {5, Integer.MIN_VALUE, 66, 45, 3, 8, Integer.MAX_VALUE, 40};
        int expectedResult = 4;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenNumbersEmptyArray_NegativeTest() {

        int[] array = {};
        int expectedResult = -1;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersInAnArray() {

        int[] array = {5, 67, 66, 45, 3, 8, 23, 40};
        int expectedResult = 5;

        int actualResult = new countOddValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersWithZeroInAnArray() {

        int[] array = {5, 0, 66, 45, 3, 8, 0, 40};
        int expectedResult = 3;

        int actualResult = new countOddValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersIncludingMinAndMaxInAnArray() {

        int[] array = {5, Integer.MIN_VALUE, 66, 45, 3, 8, Integer.MAX_VALUE, 40};
        int expectedResult = 4;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddNumbersEmptyArray_NegativeTest() {

        int[] array = {};
        int expectedResult = -1;

        int actualResult = new countOddValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}