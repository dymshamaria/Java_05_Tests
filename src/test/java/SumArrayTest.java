import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testNotNegativeValue() {
        int[] numArr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(numArr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeValue() {
        int[] numArr = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(numArr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZeroLengthArray() {
        int[] zeroLenArr = new int[0];
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(zeroLenArr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNullArray() {
        int[] zeroLenArr = null;
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(zeroLenArr);

        Assert.assertEquals(actualResult, expectedResult);
    }





}
