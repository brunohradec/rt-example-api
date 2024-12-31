package com.example.rt_example_api.services;

import com.example.rt_example_api.model.Job;
import com.example.rt_example_api.model.enums.JobType;
import com.example.rt_example_api.repos.JobRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    private final JobRepo jobRepo;

    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public Page<Job> findJobsByType(JobType type, Pageable pageable) {
        return jobRepo.findJobsByType(type, pageable);
    }
}
