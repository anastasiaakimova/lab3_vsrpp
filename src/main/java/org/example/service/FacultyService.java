package org.example.service;

import org.example.entity.Faculty;

public interface FacultyService extends Service<Faculty> {
    Faculty readByName(String name);
}
