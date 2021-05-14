package org.example.repository;

import org.example.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Groups, Long> {
    Groups findByGrName(String name);
}
