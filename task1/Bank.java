import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, User> users;

    public Bank() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User authenticateUser(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.getPin().equals(pin)) {
            return user;
        }
        return null;
    }

    public User getUserById(String userId) {
        return users.get(userId);
    }

    public void displayUserIds() {
        System.out.println("Available user IDs:");
        for (String userId : users.keySet()) {
            System.out.println(userId);
        }
    }
}
