package com.glqdlt.ex.replication;

public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayHi(String name) {
        return "Hi " + name;
    }

    @Override
    public String sayThankYou(String name) {
        return "THX " + name;
    }

    @Override
    public void echo(String name) {
        System.out.println("yahoo "+name);
    }
}
