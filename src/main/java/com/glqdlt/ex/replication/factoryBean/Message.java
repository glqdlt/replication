package com.glqdlt.ex.replication.factoryBean;

import lombok.Getter;

public class Message {

    @Getter
    private String text;

    private Message(String text) {
        this.text = text;
    }

    public static Message newMessage(String text) {
        return new Message(text);
    }

}
