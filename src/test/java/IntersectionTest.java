//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class IntersectionTest {
//
//    @Test
//    public void testIntersection_HappyPath1() {
//
//        int[][] massive = new int[][]{{1, 2, 4, 5, 89}, {8, 9, 4, 2}};
//        int[] number = new int[]{2, 4};
//
//        int[][] expectedResult = new int[][]{{1, 2, 4, 5, 89}, {8, 9, 4, 2}, {2, 4}};
//
//        int[] actualResult = new Intersection().intersection(massive, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testIntersection_HappyPath2() {
//
//        int[][] massive = new int[][]{{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2}};
//        int[] number = new int[]{8, 9};
//
//        int[][] expectedResult = new int[][]{{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2}, {8, 9}};
//
//        int[] actualResult = new Intersection().intersection(massive, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testIntersection_HappyPath3() {
//
//        int[][] massive = new int[][]{{1, 2, 4, 5, 89}, {8, 9, -4, -2}};
//        int[] number = new int[]{};
//
//        int[][] expectedResult = new int[][]{{1, 2, 4, 5, 89}, {8, 9, 45}, {}};
//
//        int[] actualResult = new Intersection().intersection(massive, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//}
