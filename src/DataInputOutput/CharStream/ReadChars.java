package DataInputOutput.CharStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadChars {
    public static void main(String[] args) throws IOException {
        char[] data = new char[5];
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println(bufferedReader.read(data));
        System.out.println(data);
    }
}
