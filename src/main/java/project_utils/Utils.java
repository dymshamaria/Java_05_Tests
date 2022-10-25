package project_utils;

public class Utils {
    static int numberTask = 1;

    public static void printTask() {
        System.out.print("\n------" + "Task № " + numberTask++ + "------" + "\n");
    }

//    static int numberTest = 1;
//
//    public static void printTest() {
//
//        System.out.print("\n" + "*" + "Test № " + numberTest++ + "*" + "\n");
//    }

//    public static String verifyEquals(String expectedResult, String actualResult) {
//        if (expectedResult.equals(actualResult)) {
//
//            return "Pass";
//        } else {
//
//            return "Fail";
//        }
//    }

    public static void main(String[] args) {

        //1.
        printTask();

    }
}
