package com.ct;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Canary extends Bird implements Greetable {

    private String name;

    private boolean isYellow;

    public void sayHello() {
        System.out.println("tweet");
    }

    //make a bird super class - done
    //make implement greetable - done
    // add another bird type -> Crow - done

}
