package com.ct.threelayer.ops;

import com.ct.common.Creatable;
import lombok.Builder;
import lombok.Data;

//data transfer objects
@Data
@Builder
public class OpsCreateUserRequest implements Creatable {

    private String name;

    private String password;

    private String orgId;

}
