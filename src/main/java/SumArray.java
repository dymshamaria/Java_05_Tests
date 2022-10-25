public class SumArray {
    public int sumArray(int[] numArr) {
        if(numArr != null) {
            int result = 0;

            for (int i : numArr) {
                result += i;
            }

            return result;
        }
        return 0;
    }
}
