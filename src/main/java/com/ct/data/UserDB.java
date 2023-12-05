package com.ct.data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@EqualsAndHashCode(of = "id")
//Pretend Database Object
public class UserDB {

    private UUID id;

    private String name;

    private int age;

    private String city;

    private boolean hasLoggedIn;

    private String password;

    private Instant createdOn;

}
