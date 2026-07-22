public class WhileLoops {

    public static String reverse(String str) {

        int i = 0;
        // Variable , Condition, Increment/ Decrement

        // for (int i = 0; i < 5; i++) {

        // }

        // Condition
        while (i < 5) {

            // Action
            System.out.println("hello eki!");

            // Meeting that condition ()
            i++;

        }

        return "";
    }

    public static void main(String[] args) {

        /**
         * Write a function that reverses a string. The input string is given as an
         * array of characters s.
         * 
         * You must do this by modifying the input array in-place with O(1) extra
         * memory.
         */

        String str = "Christopher";
        System.out.println(reverse(str));
        // reverse(str);

    }
}
