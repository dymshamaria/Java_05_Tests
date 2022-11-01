//public class Intersection {
//
//    public int[] intersection(int[][] a, int[] b) {

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    a[j] = -2147483648;
//                }
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//            for (int j = i + 1; j < b.length; j++) {
//                if (b[i] == b[j]) {
//                    b[j] = -2147483648;
//                }
//            }
//        }

//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                if (b[j] == a[i])
//                    if (a[i] != -2147483648) {
//                        count++;
//                        break;
//                    }
//            }
//        }
//        if (count == 0) {
//
//            return new int[]{};
//
//        } else {
//            int[] result = new int[count];
//            count = 0;
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < b.length; j++) {
//                    if (b[j] == a[i] && a[i] != -2147483648 && b[j] != -2147483648) {
//                        result[count] = a[i];
//                        count++;
//                        break;
//                    }
//                }
//            }

//            return result;
//        }
//    }
//}
