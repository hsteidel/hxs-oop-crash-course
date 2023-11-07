package com.ct.threelayer.api;

import com.ct.threelayer.service.TieredUserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HttpUserApi {

    private final TieredUserService userService;

    //@PostEndpoint("/users")
    public UserWithListDTO createUser(CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

}
