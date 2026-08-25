package Files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ProfilePhoto {
    public static void main(String[] args) throws IOException {
        String src = "C:\\Users\\riche\\dev\\Java_Tutorial_with_Eki\\Files\\src\\hype.jpg";
        String dest = "C:\\Users\\riche\\dev\\Java_Tutorial_with_Eki\\Files\\confused.jpg";

        try (InputStream in = new BufferedInputStream(new FileInputStream(src));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    // Byte Streams - 8-bits, bytes,
    // Char Streams - char values
}