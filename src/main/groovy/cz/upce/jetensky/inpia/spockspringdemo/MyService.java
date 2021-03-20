package cz.upce.jetensky.inpia.spockspringdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello() {
        String message = "Hello";
        System.out.println(message);
        return message;
    }
}
