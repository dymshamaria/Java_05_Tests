import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //1.
    @Test
    public void testStringMethods_Positive1() {

        String test = " Red Rover School ";
        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(test);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_Positive2() {

        String test = "Red Rover School";
        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(test);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_Positive3() {

        String test = "";
        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(test);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //5.
    @Test
    public void testCountAs_StringIsEmpty_Positive1() {

        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_StringIsEmpty_Positive2() {

        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_StringIsEmpty_Positive3() {

        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_StringIsEmpty_Negative() {

        String text = "";
        String expectedResult = "Invalid value";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_StringIsNull_Negative() {

        String text = null;
        String expectedResult = "null";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //10.
    @Test
    public void testAbracadabra_Positive() {

        String text = "Abracadabra";
        String letter = "b";
        String expectedResult = "bracadab";

        String actualResult = new StringMethods().useIndexOfAndLastIndexOfMethod(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWhippersnapper_Positive() {

        String text = "Whippersnapper";
        String letter = "p";
        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().useIndexOfAndLastIndexOfMethod(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //11.
    @Test
    public void testAbracadabraTrue_Positive() {

        String word = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(word);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAbracadabraTrue_Negative() {

        String word = "Abracadabr";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(word);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWhippersnapperFalse_Positive() {

        String word = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(word);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWhippersnapperFalse_Negative() {

        String word = "Whippersnapperw";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().isFirstAnaLastLetterEqual(word);

        Assert.assertEquals(actualResult, expectedResult);
    }





}
