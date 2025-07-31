package com.rushikesh.TaskTracker.mappers;

import com.rushikesh.TaskTracker.domain.dto.TaskDto;
import com.rushikesh.TaskTracker.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);

}
