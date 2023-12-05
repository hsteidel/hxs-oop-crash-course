package com.ct.api.v1.users;

import com.ct.data.TodoItemDB;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

//data transfer objects
@Data
@Builder
public class UserWithListDTO {

    private UUID userId;

    private String name;

    private String city;

    private List<TodoItemDB> todoList;

    private LocalDate createdOn;

}
