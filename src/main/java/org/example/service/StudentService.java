package org.example.service;

import org.example.entity.Students;

import java.util.List;

public interface StudentService extends Service<Students> {
    List<Students> readByGroupId(Long groupId);

    List<Students> readBySurname(String surname);
}
