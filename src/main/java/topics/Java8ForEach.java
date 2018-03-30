package topics;

import java.util.ArrayList;
import java.util.List;

/*
There are two ways to do iteration - internal and external.
In external iteration you bring the data to the code,
whereas in internal iteration you bring the code to the data
*/
public class Java8ForEach {
    public void java8ForEachSample() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add(" this");
        stringList.add(" is");
        stringList.add(" string");
        stringList.add(" list");
        stringList.add(" for");
        stringList.add(" forEach");

        /*
        External iteration
        Below loop is inherently sequential,
        it couldn't be executed by multiple threads.
         */
        for (String s : stringList) {
            System.out.print(s);
        }
        System.out.println();

        /*
        Internal Iteration
        now the library is in control of how the iteration happens.
        Written in this way, the code expresses much more what and less how, the how being left to the library.
        The library authors are free to use parallelism, out-of-order execution, laziness, and all kinds of other techniques.
        This allows the library to abstract over behavior, which is a fundamentally more powerful way of doing things.
         */
        stringList.forEach(System.out::print);
        System.out.println();
    }
}
