package topics;

/*
Designing interfaces have always been a tough job because if we want to add additional methods in the interfaces,
    it will require change in all the implementing classes.
As interface grows old, the number of classes implementing it might grow to an extent that it’s not possible to extend interfaces.
That’s why when designing an application, most of the frameworks provide a base implementation class
    and then we extend it and override methods that are applicable for our application.
 */

/* ### Points about default methods in Java8 Interfaces ###

1) Java interface default methods will help us in extending interfaces without having the fear of breaking implementation classes.
2) Java 8 interface default methods will help us in avoiding utility classes,
    such as all the Collections class method can be provided in the interfaces itself.
3) Java interface default methods will help us in removing base implementation classes,
    we can provide default implementation and the implementation classes can chose which one to override.
4) One of the major reason for introducing default methods in interfaces is to enhance the Collections API in Java 8
    to support lambda expressions.
5) If any class in the hierarchy has a method with same signature, then default methods become irrelevant.
6) A default method cannot override a method from java.lang.Object.
    The reasoning is very simple, it’s because Object is the base class for all the java classes.
    So even if we have Object class methods defined as default methods in interfaces,
    it will be useless because Object class method will always be used.
    That’s why to avoid confusion, we can’t have default methods that are overriding Object class methods.
 */

/* ### Points about static methods in Java8 Interfaces ###

1) Java interface static method is part of interface, we can’t use it for implementation class objects.
2) Java interface static methods are good for providing utility methods, for example null check, collection sorting etc.
3) Java interface static method helps us in providing security by not allowing implementation classes to override them.
4) We can’t define interface static method for Object class methods,
    we will get compiler error as “This static method cannot hide the instance method from Object”.
    This is because it’s not allowed in java, since Object is the base class for all the classes
    and we can’t have one class level static method and another instance method with same signature.
5) We can use java interface static methods to remove utility classes such as Collections
    and move all of it’s static methods to the corresponding interface, that would be easy to find and use.
 */
public class Java8Interface implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1");
    }

    /*
    we must override this method to avoid diamond problem otherwise compiler will give error
    because both the interface have this default method
     */
    @Override
    public void defMethod() {
        System.out.println("Main class default method");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

    /*
    we can't override this method as this is defined as static method in both the interfaces
    that is why @Override annotation can't be used here
     */
    public static void statMethod() {
        System.out.println("Main class static method calling static methods of both the interface");
        Interface1.statMethod();
        Interface2.statMethod();
    }
}
