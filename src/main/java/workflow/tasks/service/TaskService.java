package workflow.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workflow.tasks.Task;
import workflow.tasks.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> findAll () {
        return repository.findAll();
    }

    public void create(Task task) {
        repository.insert(task);
    }
}