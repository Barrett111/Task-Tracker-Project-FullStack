package com.rushikesh.TaskTracker.services.impl;

import com.rushikesh.TaskTracker.domain.entities.TaskList;
import com.rushikesh.TaskTracker.repositories.TaskListRepository;
import com.rushikesh.TaskTracker.services.TaskListService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

//@Service
//public class TaskListServiceImpl implements TaskListService {
//
//    private  final TaskListRepository taskListRepository;
//    private final TaskListService taskListService;
//
//    public TaskListServiceImpl(TaskListRepository taskListRepository, TaskListService taskListService) {
//        this.taskListRepository = taskListRepository;
//        this.taskListService = taskListService;
//    }
//
//    @Override
//    public List<TaskList> listTaskLists() {
//        return taskListRepository.findAll();
//    }
//
//    @Override
//    public TaskList createTaskList(TaskList taskList) {
//        if(null != taskList.getId()){
//            throw new IllegalArgumentException("Task list already exists");
//        }
//        if(null == taskList.getTitle() || taskList.getTitle().isBlank()){
//            throw new IllegalArgumentException("Task list title is empty");
//        }
//
//        LocalDateTime now = LocalDateTime.now();
//        return taskListRepository.save(new TaskList(
//           null,
//           taskList.getTitle(),
//           taskList.getDescription(),
//           null,
//           now,
//           now
//        ));
//    }
//
//    @Override
//    public Optional<TaskList> getTaskList(UUID id) {
//        return taskListRepository.findById(id);
//    }
//
//    @Override
//    public TaskList updateTaskList(UUID taskListId, TaskList taskList) {
//        if(null == taskList.getId()){
//            throw  new IllegalArgumentException("Task list must have an Id");
//        }
//
//        if(!Objects.equals(taskList.getId(),taskListId)){
//            throw new IllegalArgumentException("Changing Task ID is not allowed!");
//        }
//
//        TaskList existingTaskList=taskListRepository.findById(taskListId).orElseThrow(()->
//            new IllegalArgumentException("Task list does not exist!")
//        );
//        existingTaskList.setTitle(taskList.getTitle());
//        existingTaskList.setDescription(taskList.getDescription());
//        existingTaskList.setUpdated(LocalDateTime.now());
//
//        return taskListRepository.save(existingTaskList);
//    }
//}
@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }

    @Override
    public TaskList createTaskList(TaskList taskList) {
        if (null != taskList.getId()) {
            throw new IllegalArgumentException("Task list already exists");
        }
        if (null == taskList.getTitle() || taskList.getTitle().isBlank()) {
            throw new IllegalArgumentException("Task list title is empty");
        }

        LocalDateTime now = LocalDateTime.now();
        return taskListRepository.save(new TaskList(
                null,
                taskList.getTitle(),
                taskList.getDescription(),
                null,
                now,
                now
        ));
    }

    @Override
    public Optional<TaskList> getTaskList(UUID id) {
        return taskListRepository.findById(id);
    }

    @Override
    public TaskList updateTaskList(UUID taskListId, TaskList taskList) {
        if (null == taskList.getId()) {
            throw new IllegalArgumentException("Task list must have an Id");
        }

        if (!Objects.equals(taskList.getId(), taskListId)) {
            throw new IllegalArgumentException("Changing Task ID is not allowed!");
        }

        TaskList existingTaskList = taskListRepository.findById(taskListId).orElseThrow(() ->
                new IllegalArgumentException("Task list does not exist!")
        );
        existingTaskList.setTitle(taskList.getTitle());
        existingTaskList.setDescription(taskList.getDescription());
        existingTaskList.setUpdated(LocalDateTime.now());

        return taskListRepository.save(existingTaskList);
    }

    @Override
    public void deleteTaskList(UUID taskListId) {
        taskListRepository.deleteById(taskListId);
    }
}
