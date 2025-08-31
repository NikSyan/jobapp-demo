package com.example.JobAppDemo.service;

import com.example.JobAppDemo.model.JobPost;
import com.example.JobAppDemo.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobsPost) {
        repo.addJob(jobsPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
