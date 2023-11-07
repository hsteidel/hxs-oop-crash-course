package com.ct.threelayer.data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@Builder
@EqualsAndHashCode(of = "id")
//Pretend Database Object
public class TodoItemDB {

    private UUID id;

    private UUID userId;

    private String description;

}
