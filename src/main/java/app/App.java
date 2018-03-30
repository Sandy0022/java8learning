package app;

import topics.Java8ForEach;
import topics.Java8FunctionalInterfaceLambda;
import topics.Java8Interface;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Java8");

        // forEach()
        Java8ForEach forEach = new Java8ForEach();
        forEach.java8ForEachSample();
        System.out.println();


        // Java8 Interface
        Java8Interface java8Interface = new Java8Interface();
        java8Interface.method1();
        java8Interface.method2();
        java8Interface.defMethod();
        java8Interface.defMethodInterface1();
        java8Interface.defMethodInterface2();
        Java8Interface.statMethod();


        // Java8 Functional Interface and Lambda
        Java8FunctionalInterfaceLambda interfaceLambda = new Java8FunctionalInterfaceLambda();
        interfaceLambda.funcInterfaceSample();

        System.out.println("Is 3 prime number: " + interfaceLambda.isPrimeOld(3));
        System.out.println("Is 6 prime number: " + interfaceLambda.isPrimeOld(6));
        System.out.println("Is 17 prime number: " + interfaceLambda.isPrimeOld(17));
        System.out.println("Is 1 prime number: " + interfaceLambda.isPrimeOld(1));

        System.out.println("Is 3 prime number: " + interfaceLambda.isPrimeLambda(3));
        System.out.println("Is 6 prime number: " + interfaceLambda.isPrimeLambda(6));
        System.out.println("Is 17 prime number: " + interfaceLambda.isPrimeLambda(17));
        System.out.println("Is 1 prime number: " + interfaceLambda.isPrimeLambda(1));

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }
        interfaceLambda.sumAll(integerList);
        interfaceLambda.sumAllEven(integerList);
        interfaceLambda.sumGreater5(integerList);

        interfaceLambda.conditionalSum(integerList, n -> true);
        interfaceLambda.conditionalSum(integerList, n -> n % 2 == 0);
        interfaceLambda.conditionalSum(integerList, n -> n > 5);

    }
}
