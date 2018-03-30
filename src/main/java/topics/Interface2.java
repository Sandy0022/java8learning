package topics;

public interface Interface2 {
    void method2();

    default void defMethod() {
        System.out.println("Interface2 default method");
    }

    default void defMethodInterface2() {
        System.out.println("Interface2 default method calling static method");
        statMethod();
    }

    static void statMethod() {
        System.out.println("Interface2 static method");
    }
}
