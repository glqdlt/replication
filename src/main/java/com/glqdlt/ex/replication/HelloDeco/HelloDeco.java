package com.glqdlt.ex.replication.HelloDeco;

import com.glqdlt.ex.replication.Hello;

//  프록시 패턴 중의 데코레이터 패턴
public class HelloDeco implements Hello {

    private Hello hello;

    public HelloDeco(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String sayHello(String name) {
        return hello.sayHello(name) + "!!!";
    }

    @Override
    public String sayHi(String name) {
        return hello.sayHi(name) + "!!!";
    }

    @Override
    public String sayThankYou(String name) {
        return hello.sayThankYou(name) + "!!!";
    }

    @Override
    public void echo(String name) {
        System.out.println("yahoo "+name);
    }
}
