import java.io.File;
import java.io.IOException;

public class TestErrors {

    public static void introduction() {
        /**
         * 1. Compile Time - crash becos of syntax errors
         * 2. Run Time - crashes when code runs
         * 3. Logical Errors - do not crash but they misbehave
         * 
         */
        String name = "Henry";
        int[] age = { 12, 14, 23, 52 };
        System.out.println(age[5]);

    }

    public static void errorHandling() throws IOException {

        File newFile = new File("filename.txt");

        if (newFile.createNewFile()) {
            System.out.println("New File Created");
        }

    }

    public static void main(String[] args) {
        try {
            errorHandling();
        } catch (IOException e) {
            e.printStackTrace();
        }

        introduction();
    }
}
