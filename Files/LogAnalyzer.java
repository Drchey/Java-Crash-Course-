package Files;

import java.io.*;

public class LogAnalyzer {
    public static void main(String[] args) {

        try (
                BufferedReader br = new BufferedReader(new FileReader("app.log"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("errors.log"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("ERROR")) {
                    bw.write(line);
                    bw.newLine();
                }
            }

            System.out.println("Errors extracted!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
