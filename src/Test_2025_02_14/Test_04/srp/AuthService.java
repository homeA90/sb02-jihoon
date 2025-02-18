package src.Test_2025_02_14.Test_04.srp;


public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String userId, String password) {
        if (!userRepository.existsUser(userId)) {
            return false;
        }
        return userRepository.getUserPassword(userId).equals(password);
    }

    public boolean checkAdminPrivileges(String userId) {
        return "admin".equals(userId);
    }
}
