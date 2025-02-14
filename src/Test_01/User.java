package src.Test_01;

public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("sb02.oop.pr1.User iD: " + userId);
        System.out.println("Name: " + name);
    }
}
