package com.glqdlt.ex.replication.factoryBean;

public interface FactoryBean<T> {

    T getObject() throws Exception;
    Class<? extends T> getObjectYpe();
    boolean isSingleton();
}
