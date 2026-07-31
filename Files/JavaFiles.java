package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFiles {

    public static void intro() {
        /**
         * File Handling is from the Java.io package allowing us to work with files.
         * - creating, reading, updating and deleting files.
         *
         */

    }

    public static void create() throws IOException {
        // createNewFile - check if the file is created
        File newFile = new File("test.txt");

        // We Can likewise creating in a specific path

        if (newFile.createNewFile()) {
            System.out.println("New File Created: " + newFile.getName());
        } else {
            System.out.println("File Already Exists");
        }
    }

    public static void write() {
        try {
            FileWriter myFile = new FileWriter("test2.txt");
            myFile.write("This is a Java New File ");
            myFile.close(); // we must close manually to aviod data leaks
            System.out.println("Successful.");
        } catch (IOException e) {
            e.printStackTrace();
            // System.out.println(e);
        }

    }

    public static void append() {
        try (FileWriter newFile = new FileWriter("test2.txt", true)) {
            newFile.append("\n Appended text");
            System.out.println("Successfully appended to the file");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void readFile(File newFile) throws IOException {
        Scanner myRead = new Scanner(newFile);
        while (myRead.hasNextLine()) {
            String data = myRead.nextLine();
            System.out.println(data);
        }
        /**
         * getName
         * getAbsolutePath
         * canWrite
         * canRead
         * length -
         */

        /**
         * Reading Files
         * - Scanner for Simple Text
         * - BufferedReader for Larger Text
         * - FileInputStream - Images, Audio, PDF, Video
         */
    }

    public static void delete() {
        File newFile = new File("text3.txt");
        newFile.delete();
    }

    public static void main(String[] args) {
        // try {
        // create();
        // ;
        // } catch (IOException e) {
        // System.out.println("Error Occured" + e);
        // }

        // File myObj = new File("C:\\filename.txt");
        // myObj.canRead();
        // write();
        append();
    }
}
