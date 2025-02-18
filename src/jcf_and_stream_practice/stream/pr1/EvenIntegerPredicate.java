package src.jcf_and_stream_practice.stream.pr1;

import java.util.function.Predicate;

public class EvenIntegerPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
