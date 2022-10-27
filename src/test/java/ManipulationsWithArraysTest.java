import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    //5.
    @Test
    public void CreateArrayFiveStringNumber() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //6
    @Test
    public void DoubleArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void DoubleArray_Zero() {
        int[] array = {1, 2, 3, 0, 0};
        double[] expectedResult = {1.0, 2.0, 3.0, 0.0, 0.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void DoubleArray_Negative() {
        int[] array = {};
        double[] expectedResult = {};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //7
    @Test
    public void IntArray_HappyPath() {

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void IntArray_Negative() {

        double[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //8
    @Test
    public void StringArray_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void StringArray_Negative() {

        int[] array = {};

        Assert.assertEquals(new ManipulationsWithArrays().toStringArray(array), new String[0]);
    }

    //9
    @Test
    public void areValuesGreaterThanNumber_True() {

        int[] array = {24, 17, 20, 10, 6, 9, 25, 8};
        int number = 4;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void areValuesGreaterThanNumber_False() {

        int[] array = {24, 17, 20, 10, 6, 9, 25, 8};
        int number = 7;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void areValuesGreaterThanNumber_Negative() {

        int[] array = {};
        int number = 3;
        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }



}
