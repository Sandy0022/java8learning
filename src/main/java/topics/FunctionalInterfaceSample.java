package topics;

/*
An interface with exactly one abstract method is called Functional Interface.
@FunctionalInterface annotation is added so that we can mark an interface as functional interface.

It is not mandatory to use it, but it’s best practice to use it with functional interfaces to avoid addition of extra methods accidentally.
If the interface is annotated with @FunctionalInterface annotation and we try to have more than one abstract method,
it throws compiler error.

The major benefit of java 8 functional interfaces is that
we can use lambda expressions to instantiate them and avoid using bulky anonymous class implementation.

An interface with @FunctionalInterface must have one abstract class otherwise compiler will throw error
 */
@FunctionalInterface
public interface FunctionalInterfaceSample {
    void funcMethod();
}


/*
***** Below are some examples for functional and non-functional interfaces *****


interface Foo { boolean equals(Object obj); }
// Not functional because equals is already an implicit member (Object class)



interface Comparator<T> {
    boolean equals(Object obj);
    int compare(T o1, T o2);
}
// Functional because Comparator has only one abstract non-Object method



interface Foo {
    int m();
    Object clone();
}
// Not functional because method Object.clone is not public



interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<String> arg); }
interface Z extends X, Y {}
// Functional: two methods, but they have the same signature



interface X { Iterable m(Iterable<String> arg); }
interface Y { Iterable<String> m(Iterable arg); }
interface Z extends X, Y {}
// Functional: Y.m is a subsignature & return-type-substitutable



interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<Integer> arg); }
interface Z extends X, Y {}
// Not functional: No method has a subsignature of all abstract methods



interface X { int m(Iterable<String> arg, Class c); }
interface Y { int m(Iterable arg, Class<?> c); }
interface Z extends X, Y {}
// Not functional: No method has a subsignature of all abstract methods



interface X { long m(); }
interface Y { int m(); }
interface Z extends X, Y {}
// Compiler error: no method is return type substitutable



interface Foo<T> { void m(T arg); }
interface Bar<T> { void m(T arg); }
interface FooBar<X, Y> extends Foo<X>, Bar<Y> {}
// Compiler error: different signatures, same erasure

 */
