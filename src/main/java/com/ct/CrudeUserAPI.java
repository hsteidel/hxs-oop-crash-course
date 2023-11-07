package com.ct;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CrudeUserAPI {

    private final Map<UUID, User> users = new HashMap<>();

    public User createUser(User user) {
        validateUser(user);
        var newUserId = UUID.randomUUID();
        user.setId(newUserId);
        users.put(newUserId, user);
        return user;
    }

    private void validateUser(User user) {
        if (user == null) {
            throw new RuntimeException("user is null");
        }

        if (user.getName() == null
            || user.getName().isBlank()) {
            throw new RuntimeException("user is name was not provided");
        }
    }

}
