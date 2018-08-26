package com.sda.twitter;

public class MessageCreator {
    public Message create(String content, String author) {
        return new Message(content, author);
    }
}
