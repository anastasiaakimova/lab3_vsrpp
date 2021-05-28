package org.example.repository;

import org.example.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {
    List<Students> findByGroupId(Long id);

    List<Students> findBySurname(String name);
}
