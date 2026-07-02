public class Demo {

    public static void main(String[] args) {
        // If Statments
        // - Ditacte the flow of how the program runs

        // boolean isUser = true;
        // String name = "Tyrone";

        // if (isUser && name.equals("Tyler")) {
        // System.out.println("Welcome " + name);
        // } else if (isUser && !name.equals("Tyler")) {
        // System.out.println("Your name is not Tyler");
        // }

        // else {
        // System.out.println("Denied Access");
        // }

        // int x = 134;

        // // if (x < 100) {
        // // System.out.println("X is bad");
        // // } else if (x > 130) {
        // // System.out.println("X is good");
        // // }

        // if (x == 100)
        // System.out.println(x);
        // System.out.println("Bad is creat ");

        // int[] nums = { 45, 10, 24, 12, 1, 2, 9 };

        // // for (int i = 0; i < nums.length; i++) {
        // // System.out.println(nums[i]);
        // // }

        // for (int x : nums) {
        // System.out.println(x);
        // }

        // int[][] nums = { { 1, 2 }, { 3, 4 } };

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.println(nums[j]);

        // }
        // }

        // Outer Loop , Loop inside it - 1st loop
        // what is in the second loop

        // for (int i = 0; i < 3; i++) {

        // for (int j = 1; j < 4; j++) {
        // System.out.println(i + " " + j);
        // }

        // }

        int[][] nums = { { 1, 2, 56 }, { 3, 4, 8 }, { 5, 6 } };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}