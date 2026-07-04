package LoopsIf;

public class ForLoop {

    /**
     * This is used to loop around a block of code for a determined number of times
     * 
     * // for (1st stmt; 2nd Stmt; 3rd stmt) {
     * // System.out.println(i); // Code
     * // }
     * 
     * 1st stmt - initialization
     * 2nd Stmt - condition
     * 3rd stmt- increment or decrement
     */

    public void forLoop() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Current Count: " + 1);
        }

        int[] nums = { 45, 10, 24, 12, 1, 2, 9 };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // Nested Loops

    public void nestedLoops() {
        // Outer Loop , Loop inside it - 1st loop
        // what is in the second loop

        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 4; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

}
