package com.ct.threelayer.service;

import com.ct.common.PasswordUtils;
import com.ct.common.UserValidationUtil;
import com.ct.threelayer.api.CreateUserRequest;
import com.ct.threelayer.api.UserWithListDTO;
import com.ct.threelayer.data.TieredUserRepository;
import com.ct.threelayer.data.UserDB;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
public class TieredUserService {

    private final TieredUserRepository userRepository;

    public UserWithListDTO createUser(CreateUserRequest user) {
        UserValidationUtil.validateUser(user);
        //has call the data to save the user
        var newDBUser = UserDB.builder()
                .name(user.getName())
                .age(user.getAge())
                .password(PasswordUtils.encryptPassword(user.getPassword()))
                .createdOn(Instant.now())
                .build();


        newDBUser = userRepository.saveNew(newDBUser);
        return UserWithListDTO.builder()
                .userId(newDBUser.getId())
                .name(newDBUser.getName())
                .build();
    }


}
