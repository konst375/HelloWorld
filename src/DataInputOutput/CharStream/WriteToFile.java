package DataInputOutput.CharStream;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        try (FileWriter fw = new FileWriter("src\\DataInputOutput\\CharStream\\output.txt", true)) {
            fw.write(br.readLine() + " ");
        } catch (IOException e) {
            pw.println(e);
        }
    }
}
