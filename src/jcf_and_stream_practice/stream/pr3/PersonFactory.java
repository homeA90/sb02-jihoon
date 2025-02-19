package src.jcf_and_stream_practice.stream.pr3;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
