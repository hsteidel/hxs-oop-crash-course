package com.ct;


import com.ct.threelayer.api.CreateUserRequest;
import com.ct.threelayer.api.HttpUserApi;
import com.ct.threelayer.data.TieredUserRepository;
import com.ct.threelayer.service.TieredUserService;

public class Main {
    public static void main(String[] args) {

        /* We are pretending this main is a wonderful React UI*/
        var api = new CrudeUserAPI();
        var newUser = api.createUser(User.builder().name("Joe").build());
        log("created user " + newUser);

        /* tier app */
        var repo = new TieredUserRepository();
        var service = new TieredUserService(repo);
        var httpApi = new HttpUserApi(service);

        var httpCreateUser = httpApi.createUser(CreateUserRequest.builder().name("withApi").build());
        log("http created " + httpCreateUser);


    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}