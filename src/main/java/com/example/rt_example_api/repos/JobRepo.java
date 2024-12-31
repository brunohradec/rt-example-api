package com.example.rt_example_api.repos;

import com.example.rt_example_api.model.Job;
import com.example.rt_example_api.model.enums.JobType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {
    @Query("SELECT j FROM Job j")
    Page<Job> findAllJobs(Pageable pageable);

    @Query("SELECT j FROM Job j WHERE j.type = :type")
    Page<Job> findJobsByType(
            @Param("type") JobType type,
            Pageable pageable
    );
}
