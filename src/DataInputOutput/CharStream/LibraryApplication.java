package DataInputOutput.CharStream;

import java.util.Scanner;

public class LibraryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        LibraryHelper libraryHelper = new LibraryHelper("src\\DataInputOutput\\CharStream\\backgroundInformation.txt");
        System.out.println("enter the topic of interest, if you want to stop enter stop");
        do {
            input = scanner.nextLine();
            libraryHelper.getInfoByTopic(input);
        } while (!input.equals("stop"));
    }
}
