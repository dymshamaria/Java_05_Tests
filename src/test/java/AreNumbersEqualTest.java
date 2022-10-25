import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void ExpectedNumberZero() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void ExpectedNumberOne() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void ExpectedNumberMinusOne() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }



}

