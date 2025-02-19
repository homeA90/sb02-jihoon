package src.jcf_and_stream_practice.jcf.pr1.map;

import java.util.HashSet;
import java.util.Set;

public class CompareExample {

    public static void main(String[] args) {
        sb02.jcf.pr1.map.Score scoreA = new sb02.jcf.pr1.map.Score("score1", "Lee", 90);
        sb02.jcf.pr1.map.Score scoreB = new sb02.jcf.pr1.map.Score("score1", "Park", 50);

        Set<sb02.jcf.pr1.map.Score> scoreSet = new HashSet<>();
        scoreSet.add(scoreA);
        scoreSet.add(scoreB);
        scoreSet.remove(scoreB);
    }
}
