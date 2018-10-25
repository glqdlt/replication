package com.glqdlt.ex.replication.HelloDeco;

import com.glqdlt.ex.replication.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 굳이 Hello 의 구현체를 소스상에서 선언해서 사용하지 않고, deco 할 로직만 작성 후 invoke () 메소드에 담아서 deco 처리하는 다이나믹프록시

// 다이나믹 프록시가 좋은 것은, 대상 인터페이스에 추가적인 메소드가 생기더라도, 추가 된 메소디를 예외처리해야하는 경우가 아닌 이상  소스를 고칠 필요가 없다.
public class DynamicHelloUpperCase implements InvocationHandler {

    private Object hello;

    public DynamicHelloUpperCase(Object hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret= method.invoke(hello, args);
        if (method.getName().startsWith("say")) {
            if (ret instanceof String) {
                return ((String) ret).toUpperCase()+"!!!@@@";
            }
        }
        return ret;
    }
}
