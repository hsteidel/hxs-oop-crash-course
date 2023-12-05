package com.ct.api.v2.users;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HttpUserApi {

    private final TieredUserService userService;

    //@PostEndpoint("v2/users")
    public UserWithListDTO createUser(UpdateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

}
