package in.floyed.taskmanager.controller;

import in.floyed.taskmanager.model.Task;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/v1")
public class TaskController {

    List<Task> tasks = new ArrayList<>();

    @PostMapping("/task")
    void createTask(@RequestBody Task task) {
        tasks.add(task);
    }

    @PutMapping("/task/{id}")
    void editTask(@RequestParam UUID id, Task task) {
        tasks.stream().filter(t -> t.getId().equals(id)).forEach(t -> t.setTitle(task.getTitle()));
    }
    @GetMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Task> getAllTasks() {
        return tasks;
    }

    @DeleteMapping(value = "/tasks")
    void deleteAllTasks() {
        tasks = new ArrayList<>();
    }
}
