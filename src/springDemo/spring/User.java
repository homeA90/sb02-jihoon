package src.springDemo.spring;

import java.util.UUID;

public record User(
        UUID id,
        String name
) {
}
