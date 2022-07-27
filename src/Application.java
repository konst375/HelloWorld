import basics.FindDivisors;

public class Application {
    public static void main(String[] args) {
        FindDivisors finder = new FindDivisors();
        System.out.println(finder.findDivisorsByNumber(10));
    }
}