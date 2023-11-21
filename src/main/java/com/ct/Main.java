package com.ct;


public class Main {
    public static void main(String[] args) {

        /* We are pretending this main is a wonderful React UI*/
        var api = new CrudeUserAPI();
        var newUser = api.createUser(User.builder().name("Joe").build());
        log("created user " + newUser);

    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}