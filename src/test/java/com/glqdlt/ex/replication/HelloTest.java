package com.glqdlt.ex.replication;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void invokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        String name = "Spring";

        Assert.assertEquals(6, name.length());

        Method len = String.class.getMethod("length");

        Assert.assertEquals(6, len.invoke(name));

        Method charAt = String.class.getMethod("charAt", int.class);

        Assert.assertEquals("S", charAt.invoke(name, 0).toString());

    }
}