package com.ct.threelayer.data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TieredTodoRepository {

    private final Map<UUID, TodoItemDB> todo = new HashMap<>();

    public TodoItemDB saveNew(TodoItemDB todoItemDB) {
        var newUserId = UUID.randomUUID();
        todoItemDB.setId(newUserId);
        todo.put(todoItemDB.getId(), todoItemDB);
        return todoItemDB;
    }

}
