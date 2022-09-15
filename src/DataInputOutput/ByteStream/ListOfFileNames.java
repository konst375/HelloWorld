package DataInputOutput.ByteStream;

import java.io.File;
import java.util.Date;

class ListOfFileNames {
private static final String PATH_NAME = "src\\DataInputOutput\\ByteStream";
    public static void main(String[] args) {
        File file = new File(PATH_NAME);
        try {
            String[] fileList = file.list((dir, name) -> name.endsWith(".txt"));
            assert fileList != null;
            for (String name : fileList) {
                System.out.println(name);
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid path, message: " + e.getMessage());
        }
        File file1 = new File(PATH_NAME);
        try {
            System.out.println(file1.exists());
            System.out.println(file1.canExecute());
            System.out.println(file1.canWrite());
            System.out.println(file1.canRead());
            System.out.println(file1.isDirectory());
            System.out.println(file1.getAbsolutePath());
            Date dateLastModified = new Date(file1.lastModified());
            System.out.println(dateLastModified);
        } catch (NullPointerException e) {
            System.out.println("Invalid path, message: " + e.getMessage());
        }
    }


}
