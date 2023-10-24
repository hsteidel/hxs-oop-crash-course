package com.ct;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {

    private String type;

    private String name;

    public void sayHello() {
        if (type.equals("dog")) {
            //some complicated code for random noises
            System.out.println("woof");
        }
        if (type.equals("fish")) {
            System.out.println("bloop bloop");
        }
    }
}
