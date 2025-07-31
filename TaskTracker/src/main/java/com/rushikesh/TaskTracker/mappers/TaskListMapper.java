package com.rushikesh.TaskTracker.mappers;

import com.rushikesh.TaskTracker.domain.dto.TaskListDto;
import com.rushikesh.TaskTracker.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList tasklist);
}
