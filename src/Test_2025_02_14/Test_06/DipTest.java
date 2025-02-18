package src.Test_2025_02_14.Test_06;

public class DipTest {
    public static void main(String[] args) {
        ListUserRepository listUserRepository = new ListUserRepository();

        UserService userService = new UserService(listUserRepository);

        userService.registerUser("codeit", "codeit123");

        String foundPassword = userService.findPassword("codeit");
        System.out.println(foundPassword);
    }
}