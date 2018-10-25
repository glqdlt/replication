package com.glqdlt.ex.replication;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloImplTest {

    @Test
    public void simpleProxy() {

        Hello hello = new HelloImpl();
        Assert.assertEquals("Hello Jhun", hello.sayHello("Jhun"));
        Assert.assertEquals("Hi Jhun", hello.sayHi("Jhun"));
        Assert.assertEquals("THX Jhun", hello.sayThankYou("Jhun"));
    }
}