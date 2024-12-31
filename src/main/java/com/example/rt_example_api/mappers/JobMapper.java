package com.example.rt_example_api.mappers;

import com.example.rt_example_api.dto.JobDto;
import com.example.rt_example_api.model.Job;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobMapper {
    JobDto toDto(Job job);
}
