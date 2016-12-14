package com.apress.isf.spring;

import com.apress.isf.spring.helloworld.HelloWorldMessage;
import com.apress.isf.spring.helloworld.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by bv on 12/14/2016.
 */
@Component
public class SpringConfig implements CommandLineRunner {

    @Bean
    MessageService helloWorldMessageService(){

        return new HelloWorldMessage();
    }


    public String returnGreeting(String[] tokens){

        String defaultMessage = helloWorldMessageService().getMessageService();

        if (tokens == null || tokens.length == 0) {
            return defaultMessage;
        }

        StringBuilder message = new StringBuilder();
        for (String token : tokens) {
            if (token == null) continue;
            message.append(token).append('-');
        }

        return message.length() > 0 ? message.toString() : defaultMessage;
    }


    @Override
    public void run(String... strings) throws Exception {

        System.out.println(returnGreeting(strings));
    }
}
