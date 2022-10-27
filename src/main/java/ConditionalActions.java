public class ConditionalActions {

    public String conditionalActions(int M) {
        if (M % 7 == 0 && M % 9 == 0) {

            return "Good Number";
        } else if (M % 9 == 0) {

            return "Bad Number";
        } else if (M % 11 == 0 && M % 7 != 0) {

            return "Poor Number";
        }

        return "-1";
    }
}
