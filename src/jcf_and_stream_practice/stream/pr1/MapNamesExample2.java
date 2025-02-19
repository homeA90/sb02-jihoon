package src.jcf_and_stream_practice.stream.pr1;

import java.util.Arrays;
import java.util.List;

public class MapNamesExample2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

//        List<String> namesWithLength = names.stream()
//                .map(new Function<String, String>() {
//
//                    @Override
//                    public String apply(String name) {
//                        return name + ": " + name.length();
//                        // "Alice: 5"
//                    }
//                })
//                .toList();

        List<String> namesWithLength = names.stream()
                        .map(name -> name + ": " + name.length())
                        .toList();

        System.out.println(namesWithLength);
    }
}
