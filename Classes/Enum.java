package Classes;

// Enum defines a fixed set of constants
// Each constant here also carries extra data (caption)
enum Stages {

    // These are enum constants (objects of type Stages)
    // Each one calls the constructor with a caption
    PRIMARY("This is primary option"),
    SECONDARY("This is a Secondary Option"),
    TETIARY("This is the final Option");

    // Instance variable (each constant has its own value)
    private String caption;

    // Constructor (automatically private in enums)
    // Used to initialize each constant
    private Stages(String caption) {
        this.caption = caption;
    }

    // Method to access the caption
    public String getCaption() {
        return caption;
    }
}

public class Enum {

    public static void main(String[] args) {

        // // Assigning a specific enum constant
        // Stages myObj = Stages.SECONDARY;

        // // Calling method on enum constant
        // // FIX: You must print it, otherwise nothing shows
        // System.out.println(myObj.getCaption());

        // // Example: looping through all enum values
        // for (Stages stage : Stages.values()) {
        // System.out.println(stage + " -> " + stage.getCaption());
        // }
    }
}