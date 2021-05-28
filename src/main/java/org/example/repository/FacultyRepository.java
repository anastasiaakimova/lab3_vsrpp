package org.example.repository;

import org.example.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty findFacultyName(String name);
}
