package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists {
    public static void main(String[] args) {
        /**
         * Allows us to store data of same type
         * Fixed size that cant grow and shrink
         * Index access is easy
         * 
         * ArrayList allows us to add new add new items to the area
         */
        int[] nums = new int[2]; // when size is fixed and performance matters
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println(nums.length);

        List<String> str2 = new ArrayList<>();
        str2.add("john"); // number of users is unknown

        str2.get(0);
        str2.set(0, "johnny");
        str2.remove(0);
        str2.clear();
        str2.size();

    }
}
