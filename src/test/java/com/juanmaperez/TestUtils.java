package com.juanmaperez;

import com.juanmaperez.model.Project;

import java.util.ArrayList;
import java.util.List;

public class TestUtils {

    public static List<Project> generateProjects (int size) {
        List<Project> projects = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            projects.add(new Project("Project_" + i));
        }

        return projects;
    }
}
