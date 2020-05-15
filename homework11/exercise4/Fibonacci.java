package homework11.exercise4;

import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        Stream.iterate(new long[]{0l, 1l}, n -> new long[]{n[1], n[0] + n[1]})
                .limit(100)
                .forEach(n -> System.out.println(n[0]));

    }
}
