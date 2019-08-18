package workflow.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import workflow.tasks.Task;
import workflow.tasks.service.TaskService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping("/list")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Task task) {
        taskService.create(task);
    }

}