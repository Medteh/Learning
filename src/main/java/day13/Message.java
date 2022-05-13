package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return this.sender;
    }

    public User getReceiver() {
        return this.receiver;
    }

    public String getText() {
        return this.text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "From: " + "'" + sender + "'\n" +
                "TO: " + "'" + receiver + "'\n" +
                "ON: " + date + "\n" + text + "\n";
    }
}
