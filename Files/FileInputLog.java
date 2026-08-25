package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputLog {
    /**
     * FileInput and FileOutput Streams are classes used to work with files @ Byte
     * Level
     * Used for Videos, Binary files, raw text
     */

    /**
     * FileInput, BufferedInput, DataInput, ObjectIput, ByteArrayInput
     * FileOutput, ......
     * 
     */

    // Log Transfer System
    public static void main(String[] args) {
        try (
                FileInputStream fileInput = new FileInputStream(
                        "C:\\Users\\riche\\dev\\Java_Tutorial_with_Eki\\Files\\app.log");
                FileOutputStream fileOutput = new FileOutputStream("backup.log")

        ) {
            int data;

            while ((data = fileInput.read()) != -1) {
                fileOutput.write(data);
            }

            System.out.println("Done");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
