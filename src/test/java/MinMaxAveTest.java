import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve_HappyPath() {

        int[] massive = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int min = 2;
        int max = 6;

        int[] expectedResult = new int[]{3, 7, 5};

        int[] actualResult = new MinMaxAve().minMaxAve(massive, min, max);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
