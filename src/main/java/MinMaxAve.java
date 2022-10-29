public class MinMaxAve {

    public int[] minMaxAve(int[] massive, int min, int max) {

        int[] result = new int[3];

        if (massive.length > 0 && max >= min && max <= massive.length) {

            result[0] = massive[min];
            result[1] = massive[max];

            int sum = 0;
            for (int i = min; i <= max; i++) {
                sum = sum + massive[i];
            }

            result[2] = sum / ((max - min) + 1);

            return result;
        }

        return result;
    }
}
