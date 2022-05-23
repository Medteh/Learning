package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return user.getSubscriptions().contains(this) && this.subscriptions.contains(user);
    }

    public void sendMessage(User u2, String text) {
        MessageDatabase.addNewMessage(this, u2, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
