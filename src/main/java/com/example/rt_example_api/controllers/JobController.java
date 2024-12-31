package com.example.rt_example_api.controllers;

import com.example.rt_example_api.dto.JobDto;
import com.example.rt_example_api.mappers.JobMapper;
import com.example.rt_example_api.services.JobService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService jobService;
    private final JobMapper jobMapper;

    public JobController(JobService jobService, JobMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    @GetMapping
    public ResponseEntity<Page<JobDto>> findAll(Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(jobService.findAllJobs(pageable).map(jobMapper::toDto));
    }
}
