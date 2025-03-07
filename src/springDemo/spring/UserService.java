package src.springDemo.spring;

import java.util.UUID;

public interface UserService {
    UUID registerUser(String userName);
    User getUser(UUID userId);
}
