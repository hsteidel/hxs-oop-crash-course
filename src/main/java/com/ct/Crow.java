package com.ct;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Crow extends Bird implements Greetable {

    private String name;

    private boolean isYellow;

    public void sayHello() {
        System.out.println("caw");
    }

}
