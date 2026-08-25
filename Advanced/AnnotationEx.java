package Advanced;

class Tester {

    @Deprecated
    public void test() {
        System.out.println("I am the first tester");
    }
}

public class AnnotationEx extends Tester {

    // @Override
    // public void test() {
    // System.out.println("New Tester");
    // }

    public static void main(String[] args) {
        Tester t1 = new Tester();
        t1.test();
    }

}
