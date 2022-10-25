import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testDataOdd345() {
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDataEven0() {
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

        @Test
        public void testDataEven222222() {
            int number = 222222;
            String expectedResult = "Even";

            String actualResult = new OddEven().oddEven(number);

            Assert.assertEquals(actualResult, expectedResult);
        }
    }

