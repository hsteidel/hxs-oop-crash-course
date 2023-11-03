package com.ct;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Dog extends Mammal implements Greetable {

    public void sayHello() {
        System.out.println("woof");
    }
}
