package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    // list-todos
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
    @GetMapping("add-todo")
    public String showNewTodoPage(ModelMap model){
        Todo todo = new Todo(0, (String) model.get("name"), "", LocalDate.now().plusYears(1),false);
        model.addAttribute("todo",todo);
        return "todo";
    }
    @PostMapping("add-todo")
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        if (result.hasErrors()){
            return "todo";
        }
        todoService.addTodo((String) model.get("name"), todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
