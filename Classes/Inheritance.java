package Classes;

// ----------------------
// BASE CLASS (Parent)
// ----------------------
class User {
    // private → only accessible inside this class
    private String name;

    // Constructor to initialize name
    public User(String name) {
        this.name = name;
    }

    // Public method → accessible by all subclasses
    public void getUserName() {
        System.out.println("User Name is " + name);
    }

    public void readBlog() {
        System.out.println("Reading Blog");
    }

    public void commentOnBlog() {
        System.out.println("Commenting On Blog");
    }
}

// ----------------------
// CHILD CLASS (inherits User)
// ----------------------
class Writer extends User {

    /**
     * Super Keyword is used to call the Parent Method. It give us access to the
     * Parent attribute instead of current/Sub Class.
     */
    // Constructor of Writer
    public Writer(String name) {
        // super → calls the constructor of the parent class (User)
        // This is REQUIRED because User has a parameterized constructor
        super(name);
    }

    // New functionality added by Writer
    public void writeBlog() {
        System.out.println("Writing Blog Post");
    }

    // private → NOT accessible outside this class
    private void updateBlog() {
        System.out.println("Update Blog Post");
    }

    public void deleteBlog() {
        System.out.println("Deleting Blog Post");
    }
}

// ----------------------
// GRANDCHILD CLASS (inherits Writer → User)
// ----------------------
class Admin extends Writer {

    public Admin(String name) {
        // super → calls Writer constructor
        // Writer constructor then calls User constructor
        super(name);
    }

    // Admin-specific methods
    public void createUser() {
        System.out.println("Creating User");
    }

    public void updateUser() {
        System.out.println("Updating User");
    }

    public void deleteUser() {
        System.out.println("Deleting User");
    }
}

// ----------------------
// MAIN CLASS
// ----------------------
public class Inheritance {

    // public static void main(String[] args) {

    // // Creating an Admin object
    // // Uncomment: Admin admin1 = new Admin("John Doe");

    // // // Admin inherits this method from User class
    // // Uncomment: admin1.getUserName();

    // // // Admin can also access Writer methods
    // // Uncomment: admin1.writeBlog();

    // // // And its own methods
    // // Uncomment: admin1.createUser();
    // }

}
