package com.ct.threelayer.data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TieredUserRepository {

    private final Map<UUID, UserDB> users = new HashMap<>();

    public UserDB saveNew(UserDB user) {
        var newUserId = UUID.randomUUID();
        user.setId(newUserId);
        users.put(user.getId(), user);
        return user;
    }

    public boolean doesUserExist(UUID userId) {
        var potentialExistingUser = users.get(userId);
        return potentialExistingUser != null;
    }
}
