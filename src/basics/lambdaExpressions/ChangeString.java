package basics.lambdaExpressions;

import basics.lambdaExpressions.functionalInterfaces.GettingString;

public class ChangeString {
    public static String changeString(GettingString gs, String s) {
        return gs.gettingString(s);
    }
}
