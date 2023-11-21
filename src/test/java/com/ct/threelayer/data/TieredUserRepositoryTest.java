package com.ct.threelayer.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TieredUserRepositoryTest {

    private TieredUserRepository systemUnderTest;

    @Test
    public void shouldSaveNewUser() {
        systemUnderTest = new TieredUserRepository();
        var name = "joe";
        var age = 10;
        var result = systemUnderTest.saveNew(UserDB.builder().name(name).age(10).build());
        Assertions.assertEquals(result.getName(), name);
        Assertions.assertEquals(result.getAge(), age);
    }

}