package task;

public class Utils {

    private final StringUtils stringUtils = new StringUtils();

    public boolean isAllPositiveNumbers(String... str) {
        for (String currentString : str) {
            if (!stringUtils.isPositiveNumber(currentString)) {
                return false;
            }
        }
        return true;
    }
}
