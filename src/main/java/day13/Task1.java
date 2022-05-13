package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello! How are you?");
        user1.sendMessage(user2,"Whats up?!");
        user2.sendMessage(user1, "Hello! I am fine");
        user2.sendMessage(user1,"I have had nice day");
        user2.sendMessage(user1,"And you?");
        user3.sendMessage(user1, "Hi man!");
        user3.sendMessage(user1, "Whats about your project?");
        user3.sendMessage(user1, "Have you done it?");
        user1.sendMessage(user3, "Hi");
        user1.sendMessage(user3, "Fine!");
        user1.sendMessage(user3, "I have done it!");
        user3.sendMessage(user1, "You are great");

        MessageDatabase.showDialog(user1, user3);
    }
}
