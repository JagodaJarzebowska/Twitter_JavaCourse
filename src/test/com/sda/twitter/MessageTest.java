package com.sda.twitter;

import com.sda.twitter.model.Message;
import com.sda.twitter.utils.MessageCreator;
import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

    @Test
    public void shouldCreateNewMessage() {
        //given
        MessageCreator messageCreator = new MessageCreator();
        String content = "";
        String author = "";
        //when
        Message message = messageCreator.create(content, author);

        //then
        Assert.assertNotNull(message);
    }

    @Test
    public void shouldNewMessageHaveContent(){
        //given
        MessageCreator messageCreator = new MessageCreator();
        String content = "test";
        String author = "author";
        //when
        Message message = messageCreator.create(content,author);
        //then
        Assert.assertEquals(content, message.getContent());
    }
}
