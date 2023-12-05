package com.ct.api.v1.users;

import lombok.RequiredArgsConstructor;

@Deprecated
@RequiredArgsConstructor
public class HttpUserApi {

    private final TieredUserService userService;

    //@PostEndpoint("/users")
    public UserWithListDTO createUser(UpdateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

}
