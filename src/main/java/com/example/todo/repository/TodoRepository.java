// Write your code here
package com.example.todo.repository;

import java.util.*;
import com.example.todo.model.*;

public interface TodoRepository {

    ArrayList<Todo> getTodos();

    Todo getTodoById(int id);

    Todo addTodo(Todo todo);

    Todo updateTodo(int id, Todo todo);

    void deleteTodo(int id);

}