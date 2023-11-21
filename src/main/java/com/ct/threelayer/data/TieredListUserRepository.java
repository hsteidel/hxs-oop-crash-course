package com.ct.threelayer.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TieredListUserRepository {

    private final List<UserDB> users = new ArrayList<>();

    public UserDB saveNew(UserDB user) {
        var newUserId = UUID.randomUUID();
        user.setId(newUserId);
        users.add(user);
        return user;
    }

    public boolean doesUserExist(UUID userId) {
        var potentialExistingUser = users.stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst();
        return potentialExistingUser.isPresent();
    }
}
