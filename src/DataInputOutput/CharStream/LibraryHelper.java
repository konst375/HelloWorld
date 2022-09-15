package DataInputOutput.CharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LibraryHelper {
    private final String fileName;

    public LibraryHelper(String fileName) {
        this.fileName = fileName;
    }

    public void getInfoByTopic(String topic) {
        int character;
        String info;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            do {
                character = br.read();
                if (character == '#') {
                    if (topic.compareTo(br.readLine()) == 0) {
                        do {
                            info = br.readLine();
                            if (info != null) {
                                System.out.println(info);
                            }
                        } while ((info != null) && info.compareTo("") != 0);
                        return;
                    }
                }
            } while (character != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
