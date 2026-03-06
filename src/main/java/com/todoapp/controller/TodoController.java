package com.todoapp.controller;


import com.todoapp.model.User;
import com.todoapp.service.TodoService;
import com.todoapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
    private final UserService userService;

    @GetMapping("/")
    public String dashboard(Authentication authentication, Model model) {
        User user = userService.findByEmail(authentication.getName());
        model.addAttribute("todos", todoService.getUserTodos(user));
        model.addAttribute("username", user.getUsername());
        return "dashboard";
    }

    @PostMapping("/todos/add")
    public String addTodo(@RequestParam String title,
                          Authentication authentication) {
        User user = userService.findByEmail(authentication.getName());
        todoService.addTodo(title, user);
        return "redirect:/";
    }

    @PostMapping("/todos/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/";
    }

    @PostMapping("/todos/toggle/{id}")
    public String toggleTodo(@PathVariable Long id) {
        todoService.toggleComplete(id);
        return "redirect:/";
    }
}