package com.ct.api.ops.v1;

import com.ct.adapters.GeoAdapter;
import com.ct.api.v1.users.UpdateUserRequest;
import com.ct.api.v1.users.UserWithListDTO;
import com.ct.common.PasswordUtils;
import com.ct.data.TieredListUserRepository;
import com.ct.data.UserDB;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
class OpsUserService {

    private final GeoAdapter geoAdapter;

    private final TieredListUserRepository userRepository;

    public UserWithListDTO createUser(UpdateUserRequest user) {
        // here you have ops specific logic or code

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
