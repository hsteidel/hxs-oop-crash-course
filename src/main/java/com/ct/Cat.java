package com.ct;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Cat extends Mammal {

    private String name;

    //come up with a superclass that applies to both Cat and Dog that is also a HousePet - done
}
