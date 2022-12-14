import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void isPositiveNumber() {
        int number = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isPositiveNumberZero() {
        int number = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isNegativeNumber() {
        int number = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }






}
