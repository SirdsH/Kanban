package cz.educanet.jpa.entities;

import cz.educanet.jpa.model.TaskEnum;
import jakarta.persistence.*;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    @Column
    private String taskName;
    @Column
    private TaskEnum parentTask;
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskEnum getParentTask() {
        return parentTask;
    }

    public void setParentTask(TaskEnum parentTask) {
        this.parentTask = parentTask;
    }
}
