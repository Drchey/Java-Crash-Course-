package DataTypes;

public class TypeCasting {
    /* Type casting means converting one data type into another */

    // 1 - Widening Casting (Widening casting is done automatically)
    int myInt = 120;
    double myDouble = myInt; // Result: 120.0

    // 2 - Narrowing casting must be done manually by placing the type in
    // parentheses () in front of the value.
    double myX = 9.78d;
    int myY = (int) myDouble; // Manual casting: double to int
}
