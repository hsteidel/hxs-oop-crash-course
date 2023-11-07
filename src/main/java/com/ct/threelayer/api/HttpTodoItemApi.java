package com.ct.threelayer.api;

import com.ct.threelayer.data.TodoItemDB;
import com.ct.threelayer.service.TieredTodService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HttpTodoItemApi {

    private final TieredTodService tieredTodService;

    //@PostEndpoint("/todo-items")
    public TodoItemDB create(TodoItemDB item) {
        return tieredTodService.create(item);
    }

}
