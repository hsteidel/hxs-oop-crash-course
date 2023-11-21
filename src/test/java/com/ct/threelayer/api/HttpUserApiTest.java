package com.ct.threelayer.api;

import com.ct.threelayer.data.TieredUserRepository;
import com.ct.threelayer.service.TieredUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HttpUserApiTest {

    private HttpUserApi sut;

    @Test
    public void saveHappyPath() {
        sut = new HttpUserApi(new TieredUserService(new TieredUserRepository()));
        var name = "joe";
        var result = sut.createUser(
                CreateUserRequest.builder()
                        .name(name)
                        .password(" sdas ")
                .build());
        Assertions.assertEquals(name, result.getName());
    }

}