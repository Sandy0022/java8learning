package topics;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Java8FunctionalInterfaceLambda {
    public void funcInterfaceSample() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable with traditional way");
            }
        };

        Runnable r1 = () -> System.out.println("My Runnable with Lambda");

        FunctionalInterfaceSample functionalInterfaceSample = () -> System.out.println("My functional interface object");
    }

    public boolean isPrimeOld(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPrimeLambda(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(index -> number % index == 0);
    }

    public void sumAll(List<Integer> integerList) {
        int sum = 0;
        for (int i : integerList) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);
    }

    public void sumAllEven(List<Integer> integerList) {
        int sum = 0;
        for (int i : integerList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all even elements: " + sum);
    }

    public void sumGreater5(List<Integer> integerList) {
        int sum = 0;
        for (int i : integerList) {
            if (i > 5) {
                sum += i;
            }
        }
        System.out.println("Sum of all elements greater than 5: " + sum);
    }

    public void conditionalSum(List<Integer> integerList, Predicate<Integer> predicate) {
        int sum = integerList.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum of all elements: " + sum);
    }
}
