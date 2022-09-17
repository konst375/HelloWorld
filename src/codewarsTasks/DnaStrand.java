package codewarsTasks;

public class DnaStrand {
    public static void main(String[] args) {
        System.out.println(makeComplement("AATTAGCG"));
    }

    public static String makeComplement(String dna) {
        String[] inputDna = dna.split("");
        StringBuilder result = new StringBuilder();
        for (String D : inputDna) {
            switch (D) {
                case "T" -> result.append("A");
                case "A" -> result.append("T");
                case "C" -> result.append("G");
                case "G" -> result.append("C");
                default -> System.out.println("invalid character");
            }
        }
        return result.toString();
    }
}
