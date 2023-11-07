package com.ct.threelayer.ops;

import com.ct.threelayer.api.CreateUserRequest;

public class OpsAPI {

    //@Endpoint("/ops/users")
    public void createUser(CreateUserRequest userRequest) {
        //TieredUserService.create(userRequest)
        //OpsUserService(TrieredUserRepository)
        // -> opsuservice would then have the logic that it requires to create users from an ops perspective
        // UserValidationUtil.validateUser(userRequest);
    }
}
