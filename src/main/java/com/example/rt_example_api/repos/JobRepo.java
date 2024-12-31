package com.example.rt_example_api.repos;

import com.example.rt_example_api.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {
    @Query("SELECT j FROM Job j")
    Page<Job> findAllJobs(Pageable pageable);
}
