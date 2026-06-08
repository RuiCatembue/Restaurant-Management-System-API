package restaurant._management_system.dto;

import lombok.Getter;

public class TaskResponseDTO {

    private Long id;
    private String title;
    @Getter
    private String description;
    @Getter
    public boolean completed;

    public TaskResponseDTO(){

    }

    public TaskResponseDTO(Long id, String title, String description, boolean completed){
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public boolean iscompleted(){
        return completed;
    }
}
