package com.ct.threelayer.service;

import com.ct.adapters.GeoAdapter;
import com.ct.common.PasswordUtils;
import com.ct.common.UserValidationUtil;
import com.ct.threelayer.api.CreateUserRequest;
import com.ct.threelayer.api.UserWithListDTO;
import com.ct.threelayer.data.TieredListUserRepository;
import com.ct.threelayer.data.UserDB;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
public class TieredUserService {

    private final GeoAdapter geoAdapter;

    private final TieredListUserRepository userRepository;


    public UserWithListDTO createUser(CreateUserRequest user) {
        UserValidationUtil.validateUser(user);
        //has call the data to save the user

        var city = geoAdapter.findCityByZipCode(user.getZipCode());

        var newDBUser = UserDB.builder()
                .name(user.getName())
                .age(user.getAge())
                .city(city)
                .password(PasswordUtils.encryptPassword(user.getPassword()))
                .createdOn(Instant.now())
                .build();

        newDBUser = userRepository.saveNew(newDBUser);
        return UserWithListDTO.builder()
                .userId(newDBUser.getId())
                .name(newDBUser.getName())
                .city(newDBUser.getCity())
                .build();
    }


}
