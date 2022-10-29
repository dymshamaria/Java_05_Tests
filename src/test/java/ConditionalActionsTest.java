import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {


    @Test
    public void conditionalActionsGoodNumber() {

        int M = 0;
        String expectedResult = "Good Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void conditionalActionsBadNumber() {

        int M = 18;
        String expectedResult = "Bad Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void conditionalActionsPoorNumber() {

        int M = 11;
        String expectedResult = "Poor Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }






}

