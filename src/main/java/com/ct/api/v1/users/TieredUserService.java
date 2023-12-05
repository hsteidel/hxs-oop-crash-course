package com.ct.api.v1.users;

import com.ct.adapters.GeoAdapter;
import com.ct.common.PasswordUtils;
import com.ct.data.TieredListUserRepository;
import com.ct.data.UserDB;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
class TieredUserService {

    private final GeoAdapter geoAdapter;

    private final TieredListUserRepository userRepository;

    private final UserValidationService userValidationService;


    public UserWithListDTO createUser(UpdateUserRequest user) {
        userValidationService.isUserValid(user);
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
