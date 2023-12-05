package com.ct.api.v1.todo;

import com.ct.data.TieredTodoRepository;
import com.ct.data.TieredUserRepository;
import com.ct.data.TodoItemDB;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TieredTodService {

    private final TieredTodoRepository todoRepository;

    private final TieredUserRepository userRepository;

    public TodoItemDB create(TodoItemDB todoItemDB) {
        if (!userRepository.doesUserExist(todoItemDB.getUserId())) {
            throw new RuntimeException("user does not exist!");
        }
        return todoRepository.saveNew(todoItemDB);
    }


}
