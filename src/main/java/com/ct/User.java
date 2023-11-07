package com.ct;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@Builder
@EqualsAndHashCode(of = "id")
public class User {

    private UUID id;

    private String name;

}
