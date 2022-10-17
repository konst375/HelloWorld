package basics.lambdaExpressions;

public class MyIntNum {
    private final int v;

    public MyIntNum(int v) {
        this.v = v;
    }

    public boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
