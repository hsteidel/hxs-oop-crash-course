package com.ct;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
/*
 * With inheritance, we've modeled a GolfFish that is a Fish that is a HousePet
 */
public class Snapper extends Fish implements Greetable {

    private String color;

    @Override
    public void sayHello() {
        System.out.println("bloop blopp");
    }
}
