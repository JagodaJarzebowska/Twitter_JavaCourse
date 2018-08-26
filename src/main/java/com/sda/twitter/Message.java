package com.sda.twitter;

public class Message {

    private String content;
    private String author;

    public Message(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor(){
        return author;
    }
}
