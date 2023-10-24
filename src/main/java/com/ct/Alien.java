package com.ct;

public class Alien implements Greetable {
    @Override
    public void sayHello() {
        throw new RuntimeException("not supported");
    }
}
