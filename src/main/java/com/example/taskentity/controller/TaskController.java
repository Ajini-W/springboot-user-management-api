package com.example.taskentity.controller;
import java.util.List;
import com.example.taskentity.entity.TaskEntity;
import com.example.taskentity.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class TaskController {
	@Autowired
	private TaskService service;
	 // Create
    @PostMapping("/register")
    public TaskEntity registerUser(@RequestBody TaskEntity user) {
        return service.saveUser(user);
    }

    // Login
    @PostMapping("/login")
    public String loginUser(@RequestBody TaskEntity user) {
        TaskEntity existing = service.login(user.getUsername(), user.getPassword());
        if (existing != null)
            return "Login successful!";
        else
            return "Invalid credentials!";
    }

    // Read all
    @GetMapping
    public List<TaskEntity> getAllUsers() {
        return service.getAllUsers();
    }

    // Update
    @PutMapping("/{id}")
    public TaskEntity updateUser(@PathVariable Long id, @RequestBody TaskEntity user) {
        return service.updateUser(id, user);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "User deleted!";
    }
}
