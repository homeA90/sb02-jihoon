package src.Test_2025_02_14.Test_06;

public interface UserRepository {
    void saveUser(String userId, String password);
    String getUserPassword(String userId);
    boolean existsUser(String userId);
}