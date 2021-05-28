package org.example.service.impl;

import org.example.entity.Faculty;
import org.example.repository.FacultyRepository;
import org.example.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;

    @Override
    public Faculty readByName(String name) {
        return facultyRepo.findFacultyName(name);
    }

    @Override
    public Faculty read(Long id) {
        return facultyRepo.findById(id).get();
    }

    @Override
    public List<Faculty> readAll() {
        return facultyRepo.findAll();
    }

    @Override
    public void save(Faculty entity) {
        facultyRepo.save(entity);
    }

    @Override
    public void delete(Long id) {
        facultyRepo.deleteById(id);
    }

    @Override
    public void edit(Faculty entity) {
        Faculty faculty = facultyRepo.findById(entity.getId()).orElseThrow(IllegalArgumentException::new);
        faculty.setName(entity.getName());
        facultyRepo.save(faculty);
    }
}
