package com.example.rt_example_api.controllers;

import com.example.rt_example_api.dto.JobDto;
import com.example.rt_example_api.mappers.JobMapper;
import com.example.rt_example_api.model.enums.JobType;
import com.example.rt_example_api.services.JobService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService jobService;
    private final JobMapper jobMapper;

    public JobController(JobService jobService, JobMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    @GetMapping()
    public ResponseEntity<Page<JobDto>> findAll(
            @RequestParam("type") JobType type,
            Pageable pageable) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(jobService.findJobsByType(type, pageable).map(jobMapper::toDto));
    }
}
