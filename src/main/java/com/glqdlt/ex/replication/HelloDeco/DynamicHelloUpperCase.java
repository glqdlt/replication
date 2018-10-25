package com.glqdlt.ex.replication.HelloDeco;

import com.glqdlt.ex.replication.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 굳이 Hello 의 구현체를 소스상에서 선언해서 사용하지 않고, deco 할 로직만 작성 후 invoke () 메소드에 담아서 deco 처리하는 다이나믹프록시
public class DynamicHelloUpperCase implements InvocationHandler {

    private Hello hello;

    public DynamicHelloUpperCase(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String ret = (String) method.invoke(hello,args);

        return ret.toUpperCase();
    }
}
