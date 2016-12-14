package com.apress.isf.spring.helloworld;

/**
 * Created by bv on 12/14/2016.
 */
public class HelloWorldMessage implements MessageService {



    @Override
    public String getMessageService() {
        return "Hello World";
    }
}
