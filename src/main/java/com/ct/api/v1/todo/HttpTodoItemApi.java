package com.ct.api.v1.todo;

import com.ct.data.TodoItemDB;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HttpTodoItemApi {

    private final TieredTodService tieredTodService;

    //@PostEndpoint("/todo-items")
    public TodoItemDB create(TodoItemDB item) {
        return tieredTodService.create(item);
    }

}
