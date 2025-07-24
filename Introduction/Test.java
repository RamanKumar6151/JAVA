package Introduction;

public class Test {
    public static void main(String[] args) {
        // Test obj = new Test();
        test tst = new test();
        tst.display();
    }

    static class test {
        String str = "hello";

        void display() {
            System.out.println(str);
        }
    }
}
