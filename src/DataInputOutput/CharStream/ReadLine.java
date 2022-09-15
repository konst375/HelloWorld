package DataInputOutput.CharStream;

import java.io.*;

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
