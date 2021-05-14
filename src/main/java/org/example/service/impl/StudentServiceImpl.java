package org.example.service.impl;

import org.example.entity.Groups;
import org.example.entity.Students;
import org.example.repository.GroupRepository;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepo;
    @Autowired
    private GroupRepository groupRepo;

    @Override
    public Students read(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Students> readAll() {
        return studentRepo.findAll();
    }

    @Override
    public void save(Students entity) {
        Groups group = entity.getGroup();
        Long id = group.getId();
        group = groupRepo.findById(id).orElseThrow(IllegalArgumentException::new);
        entity.setGroup(group);
        group.getStudentsSet().add(entity);
        groupRepo.save(group);
    }

    @Override
    public void delete(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public void edit(Students entity) {
        Groups group = entity.getGroup();
        Long gId = group.getId();
        Long sId = entity.getId();
        group = groupRepo.findById(gId).orElseThrow(IllegalArgumentException::new);
        Students student = group.getStudentsSet().stream().filter(s -> sId.equals(s.getId())).findAny().orElseThrow(IllegalArgumentException::new);
        student.setGroup(group);
        student.setName(entity.getName());
        student.setSurname(entity.getSurname());
        student.setPhoneNumber(entity.getPhoneNumber());
        group.getStudentsSet().add(student);
        studentRepo.save(student);
    }

    @Override
    public List<Students> readByGroupId(Long groupId) {
        return studentRepo.findByGroupId(groupId);
    }

    @Override
    public List<Students> readBySurname(String surname) {
        return studentRepo.findBySurname(surname);
    }
}