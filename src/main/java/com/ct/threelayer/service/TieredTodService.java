package com.ct.threelayer.service;

import com.ct.threelayer.data.TieredTodoRepository;
import com.ct.threelayer.data.TieredUserRepository;
import com.ct.threelayer.data.TodoItemDB;
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
