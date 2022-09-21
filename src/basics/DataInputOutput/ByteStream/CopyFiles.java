package basics.DataInputOutput.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFiles {
    public static void main(String[] args) {
        int i;
        try (FileInputStream inputFile = new FileInputStream("D:\\java\\HelloWorld\\src\\basics.DataInputOutput\\ByteStream\\first.txt");
             FileOutputStream outputFile = new FileOutputStream("D:\\java\\HelloWorld\\src\\basics.DataInputOutput\\ByteStream\\second.txt")) {
            do {
                i = inputFile.read();
                if (i != -1) {
                    outputFile.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("input/output error: " + e);
        }
    }
}
