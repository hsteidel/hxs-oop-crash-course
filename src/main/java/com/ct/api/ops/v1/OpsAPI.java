package com.ct.api.ops.v1;

import com.ct.api.v1.users.UpdateUserRequest;

public class OpsAPI {



    //@Endpoint("/ops/v1/users")
    public void updateUser(UpdateUserRequest userRequest) {
        //TieredUserService.create(userRequest)
        //OpsUserService(TrieredUserRepository)
        // -> opsuservice would then have the logic that it requires to create users from an ops perspective
        // UserValidationUtil.validateUser(userRequest);
    }
}
