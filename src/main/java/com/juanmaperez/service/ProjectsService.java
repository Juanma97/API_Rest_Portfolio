package com.juanmaperez.service;

import com.juanmaperez.model.Project;
import com.juanmaperez.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {

    private ProjectRepository projectRepository;

    public ProjectsService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project insertProject(Project project) {
        return projectRepository.save(project);
    }
}
