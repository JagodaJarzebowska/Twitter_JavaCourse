package com.sda.twitter;

import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

    @Test
    public void shouldCreateNewMessage() {
        //given
        MessageCreator messageCreator = new MessageCreator();
        String content = "";
        //when
        Message message = messageCreator.create(content);

        //then
        Assert.assertNotNull(message);
    }

    @Test
    public void shouldNewMessageHaveContent(){
        //given
        MessageCreator messageCreator = new MessageCreator();
        String content = "test";
        //when
        Message message = messageCreator.create(content);
        //then
        Assert.assertEquals(content, message.getContent());
    }
}
