package com.glqdlt.ex.replication.factoryBean;

import com.glqdlt.ex.replication.Hello;
import com.glqdlt.ex.replication.HelloDeco.DynamicHelloUpperCase;

import java.lang.reflect.Proxy;

public class HelloFactoryBean implements FactoryBean<Hello> {

    private Hello hello;

    public HelloFactoryBean(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Hello getObject() throws Exception {
        return (Hello) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Hello.class},new DynamicHelloUpperCase(hello));
    }

    @Override
    public Class<? extends Hello> getObjectYpe() {
        return Hello.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
