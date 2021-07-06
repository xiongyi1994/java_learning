package stream;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

    public static void main(String[] args) {

        List<String> a = Arrays.asList("abc", "aaa");

        a.stream().limit(1).forEach(System.out::print);

    }

}
