package task;

public class App {

    private static final Utils utils = new Utils();

    public static void main(String[] args) {
        System.out.println(utils.isAllPositiveNumbers("12"));
        utils.isAllPositiveNumbers("12", "79");
    }
}