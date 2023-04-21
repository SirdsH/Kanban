package cz.educanet.jpa.bean;

import cz.educanet.jpa.entities.TaskEntity;
import cz.educanet.jpa.model.TaskEnum;
import cz.educanet.jpa.repository.TaskRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@ApplicationScoped
public class TaskBean {
    @Inject
    private TaskRepository taskRepository;

    private TaskEntity task = new TaskEntity();

    private TaskEnum[] enums = TaskEnum.values();

    public List<TaskEntity> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    public long getTaskCount() {
        return taskRepository.getAllTasks().stream().count();
    }
    public void createTask() {
        taskRepository.createTask(task);
    }

    public TaskEntity getTask() {
        return task;
    }

    public TaskEnum[] getEnums() {
        return enums;
    }
}
