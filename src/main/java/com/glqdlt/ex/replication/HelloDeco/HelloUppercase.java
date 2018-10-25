package com.glqdlt.ex.replication.HelloDeco;

import com.glqdlt.ex.replication.Hello;

public class HelloUppercase implements Hello {

    private Hello hello;

    public HelloUppercase(Hello hello) {

        this.hello = hello;
    }

    @Override
    public String sayHello(String name) {
        return hello.sayHello(name).toUpperCase();
    }

    @Override
    public String sayHi(String name) {
        return hello.sayHi(name).toUpperCase();
    }

    @Override
    public String sayThankYou(String name) {
        return hello.sayThankYou(name).toUpperCase();
    }

    @Override
    public void echo(String name) {
        System.out.println("yahoo "+name);
    }
}
