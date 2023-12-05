package com.ct.api.ops.v1;

import lombok.Builder;
import lombok.Data;

//data transfer objects
@Data
@Builder
public class OpsUpdateUserRequest {

    private String name;

    private int age;

    private int zipCode;

    private boolean accountExpired;

    private boolean initiatePasswordReset;

}
