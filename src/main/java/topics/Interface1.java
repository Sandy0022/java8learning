package topics;

public interface Interface1 {
    void method1();

    default void defMethod() {
        System.out.println("Interface1 default method");
    }

    default void defMethodInterface1() {
        System.out.println("Interface1 default method calling static method");
        statMethod();
    }

    static void statMethod() {
        System.out.println("Interface1 static method");
    }
}
