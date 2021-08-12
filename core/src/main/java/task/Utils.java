package task;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        for (String currentString : str) {
            if (!StringUtils.isPositiveNumber(currentString)) {
                return false;
            }
        }
        return true;
    }
}
