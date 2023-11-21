package com.ct.threelayer.service;

import com.ct.threelayer.api.CreateUserRequest;
import com.ct.threelayer.data.TieredUserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TieredUserServiceTest {

    private TieredUserService sut;

    @Test
    public void testUserSaveHappyPath() {
        sut = new TieredUserService(new TieredUserRepository());
        var name = "joe";
        var result = sut.createUser(
                CreateUserRequest.builder().name(name)
                .password("1000")
                        .age(10)
                .build());
        Assertions.assertEquals(name, result.getName());
    }



}