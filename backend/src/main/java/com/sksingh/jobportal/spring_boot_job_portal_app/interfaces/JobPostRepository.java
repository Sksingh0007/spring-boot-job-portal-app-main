package com.sksingh.jobportal.spring_boot_job_portal_app.interfaces;

import com.sksingh.jobportal.spring_boot_job_portal_app.model.JobPostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPostModel, String> {
}