package com.ct.threelayer.api;

import com.ct.common.Creatable;
import lombok.Builder;
import lombok.Data;

//data transfer objects
@Data
@Builder
public class CreateUserRequest  implements Creatable {

    private String name;

    private int age;

    private int zipCode;

    private String password;

}
