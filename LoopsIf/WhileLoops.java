package LoopsIf;

public class WhileLoops {
    /**
     * While loop allows us to run a condtion as long as the condition stated is
     * true.
     */

    public void whileStmt() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    // do while is a version of while loop that allows us to run the code at least
    // once before checking

    public void doWhileStmt() {
        int i = 0;
        do {
            System.out.println(i);
        } while (i > 5);
    }
}
