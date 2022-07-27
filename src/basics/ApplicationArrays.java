package basics;

import java.util.List;

public class ApplicationArrays {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils(List.of(1, 2, 3));
        System.out.println(utils.getMinimalValue());
        System.out.println(utils.getMinimalValueV2());
        System.out.println(utils.getMinimalValueV3());
    }
}