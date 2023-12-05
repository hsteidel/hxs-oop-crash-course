package com.ct.api.v2.users;

import com.ct.common.UserValidationUtil;

class UserValidationService {

    public boolean isUserValid(UpdateUserRequest user) {
        UserValidationUtil.validateUser(user);
        return true;
    }

}
