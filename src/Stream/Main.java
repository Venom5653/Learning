package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        Stream<String> stream = strings.stream();
        strings.forEach(x -> System.out.println(x));
    }
}
