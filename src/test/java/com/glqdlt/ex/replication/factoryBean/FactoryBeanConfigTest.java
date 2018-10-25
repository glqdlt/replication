package com.glqdlt.ex.replication.factoryBean;

import com.glqdlt.ex.replication.Hello;
import com.glqdlt.ex.replication.HelloImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FactoryBeanConfigTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void name() {

        Message message = (Message) applicationContext.getBean("message");
        System.out.println(message.getText());
    }

    @Test
    public void name2() {

//        xml 설정으로 하면 아래의 & 키워드를 통해 factoryBean 을 받을수 있다고 한다.
//        java 설정에서는 안되는 모양.
        Object obj = applicationContext.getBean("&message");

        System.out.println((MessageFactoryBean) obj);

    }

    @Test
    public void name3() throws Exception {


        Hello aa = new HelloFactoryBean(new HelloImpl()).getObject();
        aa.echo("asdasd");
        System.out.println(aa.sayHi("we"));

    }
}