package com.sda.twitter;

public class MessageCreator {
    public Message create(String content) {
        return new Message(content);
    }
}
