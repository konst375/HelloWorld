package examcloudsTasks.lambdaExpressions.task1;

public class Print {
    public static void main(String[] args) {
        Printable p = () -> System.out.println("printable");
        p.print();
    }
}
