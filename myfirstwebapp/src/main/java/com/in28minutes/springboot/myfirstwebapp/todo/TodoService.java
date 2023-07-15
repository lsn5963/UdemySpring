package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount,"in28minutes", "Learn AWS", LocalDate.now().plusDays(1), false));
        todos.add(new Todo(++todosCount,"in28minutes", "Learn DevOps", LocalDate.now().plusDays(2), false));
        todos.add(new Todo(++todosCount,"in28minutes", "Learn Full Stack Development", LocalDate.now().plusDays(3), false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }
    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount, username, description,targetDate,done);
        todos.add(todo);
    }
    public void deleteById(int id){
        Predicate<? super Todo> pridicate
                = todo -> todo.getId() == id;
        todos.removeIf(pridicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> pridicate
                = todo -> todo.getId() == id;
        System.out.println("pridicate = " + pridicate);
        Todo todo = todos.stream().filter(pridicate).findFirst().get();
        return todo;
    }
}