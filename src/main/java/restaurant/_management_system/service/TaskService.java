package restaurant._management_system.service;


import restaurant._management_system.dto.TaskRequestDTO;
import restaurant._management_system.dto.TaskResponseDTO;
import restaurant._management_system.exception.ResourceNotFoundException;
import restaurant._management_system.model.Task;
import restaurant._management_system.repository.TaskRepository;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService (TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<TaskResponseDTO> getALLtasks(){
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponseDTO(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.isCompleted()
                ))
                .toList();
    }

    public TaskResponseDTO createTask(TaskRequestDTO taskRequestDTO){
        Task task = new Task();

        task.setTitle(taskRequestDTO.getTitle());
        task.setDescription(taskRequestDTO.getDescription());
        task.setCompleted(taskRequestDTO.isCompleted());

        Task savedTask = taskRepository.save(task);

        return new TaskResponseDTO(
                savedTask.getId(),
                savedTask.getTitle(),
                savedTask.getDescription(),
                savedTask.isCompleted()
        );



    };

    public TaskResponseDTO updateTask(Long id, TaskRequestDTO updatedTask){
        Task task = taskRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Task not found by id " + id));

        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setCompleted(updatedTask.isCompleted());

        Task savedTask = taskRepository.save(task);

        return new TaskResponseDTO(
                savedTask.getId(),
                savedTask.getTitle(),
                savedTask.getDescription(),
                savedTask.isCompleted()
        );
    }

    public void deleteTask(Long id){
        Task task = taskRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Task not found by id " + id));
        taskRepository.delete(task);
    }
}
