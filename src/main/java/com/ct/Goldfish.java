package com.ct;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
/*
 * With inheritance, we've modeled a GolfFish that is a Fish that is a HousePet
 */
public class Goldfish extends Fish implements Greetable {

    private String color;

    /* overriding a method*/
    public void sayHello() {
        System.out.println("bloop");
    }

}
