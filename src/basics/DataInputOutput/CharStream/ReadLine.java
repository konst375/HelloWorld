package basics.DataInputOutput.CharStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;
        do {
            string = br.readLine();
            pw.println(string);
        } while (!string.equals("stop"));
    }
}
