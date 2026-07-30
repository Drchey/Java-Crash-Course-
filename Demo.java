// /**
// * Blog
// * User - Read the Blog, Comment on the Blog, Like the Blog
// * Editors - Create a Blog, Update their Blog, delete their Blog
// * Admins - Create Writer(s), Delete A Writer
// */
// class User {

// private String name;

// // Constructors

// public User(String name) {
// this.name = name;
// }

// public void readBlog() {
// System.out.println("Reading Blog");
// }

// public void commentOnBlog() {
// System.out.println("Commenting On Blog");
// }

// public void likeBlog() {
// System.out.println("Liking A Blog Post");
// }

// // public void shareBlog() {
// // System.out.println("Sharing Blog");
// // }
// }

// class Writer extends User {

// public Writer(String name) {
// super(name);
// }

// public void createBlog() {
// System.out.println("Creating Blog");
// }

// private void updateBlog() {
// System.out.println("Updating Blog");
// }

// public void deleteBlog() {
// // System.out.println("Deleting Blog");
// }

// }

// class Admin extends Writer { // Inheriting from a single source

// public Admin(String name) {
// super(name);
// }

// public void createWriter() {
// System.out.println("Creating User");
// }

// public void deleteWriter() {
// System.out.println("Creating User");
// }

// }

// public class Demo {
// // public static void main(String[] args) {
// // // Writer john = new Writer();
// // // john.createBlog();
// // // john.commentOnBlog();

// // // Admin eki = new Admin();
// // // eki.commentOnBlog();
// // // eki.readBlog();
// // // eki.createWriter();

// // User newUser = new User("John");

// // Admin newAdmin = new Admin("Eki");
// // }
// }