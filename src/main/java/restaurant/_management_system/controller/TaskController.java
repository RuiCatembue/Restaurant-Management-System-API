package restaurant._management_system.controller;

import restaurant._management_system.dto.TaskRequestDTO;
import restaurant._management_system.dto.TaskResponseDTO;
import restaurant._management_system.service.TaskService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskResponseDTO> getALLTasks(){
        return taskService.getALLtasks();
    }

    @PostMapping
    public TaskResponseDTO createTask(@Valid @RequestBody TaskRequestDTO taskRequestDTO){
        return taskService.createTask(taskRequestDTO);
    }

    @PutMapping("/{id}")
    public TaskResponseDTO updatetask(@PathVariable Long id,@Valid @RequestBody TaskRequestDTO updatedTask){
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }

}
