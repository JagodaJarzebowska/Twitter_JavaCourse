package com.sda.twitter.utils;

import com.sda.twitter.model.Message;

public class MessageCreator {
    public Message create(String content, String author) {
        return new Message(content, author);
    }
}
