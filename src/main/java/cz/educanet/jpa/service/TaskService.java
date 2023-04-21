package cz.educanet.jpa.service;

import cz.educanet.jpa.entities.TaskEntity;
import cz.educanet.jpa.model.TaskEnum;
import cz.educanet.jpa.repository.TaskRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@RequestScoped
@Named
public class TaskService {
    @Inject
    private TaskRepository taskRepository;

    public List<TaskEntity> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    public void createTask(TaskEntity task) {
        taskRepository.createTask(task);
    }

    public void switchTask() {
        if ();
    }
}
