package final_finally_finalize;

public class FinallyConcept {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
            System.out.println("inside test method");
            throw new RuntimeException("test");

        } catch (Exception e) {
            System.out.println("inside catch block");

        } finally {
            System.out.println("inside finally block");
        }
    }
}
