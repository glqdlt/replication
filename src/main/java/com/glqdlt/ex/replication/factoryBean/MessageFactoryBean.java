package com.glqdlt.ex.replication.factoryBean;

import lombok.Setter;

public class MessageFactoryBean  implements FactoryBean<Message>{

    @Setter
    private String text;

    public MessageFactoryBean(String text) {
        this.text = text;
    }

    @Override
    public Message getObject() throws Exception {
        return Message.newMessage(this.text);
    }

    @Override
    public Class<? extends Message> getObjectYpe() {
        return Message.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
