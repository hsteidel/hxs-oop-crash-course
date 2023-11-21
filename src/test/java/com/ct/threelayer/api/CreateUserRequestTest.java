package com.ct.threelayer.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateUserRequestTest {

    @Test
    void TestCreateUserRequestEquals() {
        //fluffy test to test .equals()
        var one = new CreateUserRequest("name", 1, "pass");
        var two = new CreateUserRequest("name", 1, "pass");
        Assertions.assertEquals(one, two);
    }

}