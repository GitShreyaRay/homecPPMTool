package io.homec.ppmtool.services;

import io.homec.ppmtool.domain.Project;
import io.homec.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    public Project saveOrUpdateProject(Project project) {
        //Logic
        return projectRepository.save(project);

    }
}
