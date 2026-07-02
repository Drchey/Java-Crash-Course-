package DataTypes;

public class StringAbout {
    /* Strings are used for storing text. */

    public void stringinfo() {
        String name = "Tyler"; // surrounded by double quotes ("")

        String name2 = "Tyrone";
        String fullName = "Tyler JohnSon";
        // methods of a string
        System.out.println(name.length()); // length of string
        System.out.println(name.toUpperCase()); // uppercase TYLER
        System.out.println(name.toLowerCase()); // lowercase
        System.out.println(name.indexOf(name.indexOf("le"))); // The indexOf() method returns the index (the position)
                                                              // of
                                                              // the first occurrence of a specified text in a string
        System.out.println(name.charAt(4)); // charAt() method to access a character at a specific position in a
                                            // string

        System.out.println(name.equals(name2)); // if name is same as name2;
        System.out.println(fullName.trim()); // remove white space

        /* Concatenation */
        // - used to combine them as single string
        System.out.println(name + " " + name2);
        // - concat : alternative
        System.out.println(name.concat(name2));

        String x = "10";
        int y = 20;
        String z = x + y; // z will be 1020 (a String)
        System.out.println(z);

        // You can use backlash to handle special characters:
        String info = "there are \"Nigerians\" every country.";
        // We can use for single quotes, double quotes and backslash
    }
}
