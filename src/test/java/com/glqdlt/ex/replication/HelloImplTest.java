package com.glqdlt.ex.replication;

import com.glqdlt.ex.replication.HelloDeco.DynamicHelloUpperCase;
import com.glqdlt.ex.replication.HelloDeco.HelloDeco;
import com.glqdlt.ex.replication.HelloDeco.HelloUppercase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

@Slf4j
public class HelloImplTest {

    @Test
    public void simpleProxy() {

        Hello hello = new HelloImpl();
        Assert.assertEquals("Hello Jhun", hello.sayHello("Jhun"));
        Assert.assertEquals("Hi Jhun", hello.sayHi("Jhun"));
        Assert.assertEquals("THX Jhun", hello.sayThankYou("Jhun"));
    }

    //    정신 나간 데코의 데코 데코데코 패턴
    @Test
    public void decoTest() {
        HelloImpl hello = new HelloImpl();
        HelloDeco helloDeco = new HelloDeco(hello);
        HelloUppercase helloUppercase = new HelloUppercase(helloDeco);
        HelloDeco helloDeco1 = new HelloDeco(helloUppercase);

        log.info(helloDeco.sayHello("jhun"));
        log.info(helloUppercase.sayHello("jhun"));
        log.info(helloDeco1.sayHello("jhun"));
    }

    @Test
    public void dynamicProxy() {

        Hello hello = new HelloImpl();

        Hello upper = (Hello) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Hello.class}, new DynamicHelloUpperCase(hello));

        log.info(upper.sayHello("jhun"));


    }
}