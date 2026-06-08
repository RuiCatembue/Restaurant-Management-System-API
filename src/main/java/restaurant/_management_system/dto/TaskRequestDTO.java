package restaurant._management_system.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;

public class TaskRequestDTO {
    @NotBlank(message = " Title is required")
    @Size (min = 3, max = 100, message = "Title must be between 3 and 300 chacacters")
    private String title;

    @NotBlank(message = " Description is required")
    @Size (min = 3, max = 300, message = "Description must be between 3 and 300 chacacters")
    @Getter
    private String description;


    @Getter
    public boolean completed;

    public TaskRequestDTO(){

    };
        public String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }


        public String getDescription(){
            return description;        }

        public void setDescription(String description) {
            this.description = description;
        }


        public boolean isCompleted(){
            return completed;
    }
        public void setCompleted(boolean completed){
            this.completed = completed;
        }
    }

