package basics.DataInputOutput.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

class FilesContentMatcher {
    public static void main(String[] args) {
        int i;
        int j;
        int mismatchIndex;

        try (FileInputStream inputFile1 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\first.txt");
             FileInputStream inputFile2 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\second.txt")) {
            mismatchIndex = 0;
            do {
                i = inputFile1.read();
                j = inputFile2.read();
                mismatchIndex++;
                if (i != j) {
                    break;
                }
            } while (i != -1);

            if (i != j) {
                System.out.println("contents of the files don't match\tstarting from " + mismatchIndex + " character");
            }
            if (i == j) {
                System.out.println("contents of the files match");
            }
        } catch (IOException e) {
            System.out.println("input/output error: " + e);
        }

        try (FileInputStream inputFile1 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\first.txt");
             FileInputStream inputFile2 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\second.txt")) {
            mismatchIndex = 0;
            do {
                i = inputFile1.read();
                j = inputFile2.read();
                mismatchIndex++;
                if (i != j && !String.valueOf((char) i).equalsIgnoreCase(String.valueOf((char) j))) {
                    break;
                }
            } while (i != -1 && j != -1);

            if (i != j && !String.valueOf((char) i).equalsIgnoreCase(String.valueOf((char) j))) {
                System.out.println("contents of the files don't match ignore case\tstarting from " + mismatchIndex + " character");
            }
            if (i == j || String.valueOf((char) i).equalsIgnoreCase(String.valueOf((char) j))) {
                System.out.println("contents of the files match ignore case");
            }
        } catch (IOException e) {
            System.out.println("input/output error: " + e);
        }

        try (FileInputStream inputFile1 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\first.txt");
             FileInputStream inputFile2 = new FileInputStream("src\\basics.DataInputOutput\\ByteStream\\second.txt")) {
            mismatchIndex = 0;
            do {
                i = inputFile1.read();
                j = inputFile2.read();
                mismatchIndex++;
                if (i != j && i + 32 != j && i - 32 != j) {
                    break;
                }
            } while (i != -1 && j != -1);

            if (i != j && i + 32 != j && i - 32 != j) {
                System.out.println("contents of the files don't match ignore case\tstarting from " + mismatchIndex + " character");
            }
            if (i == j || i + 32 == j || i - 32 == j) {
                System.out.println("contents of the files match ignore case");
            }
        } catch (IOException e) {
            System.out.println("input/output error: " + e);
        }
    }
}
