package org.example.service.impl;

import org.example.entity.Groups;
import org.example.repository.GroupRepository;
import org.example.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepo;

    @Override
    public Groups readByName(String name) {
        return groupRepo.findByGrName(name);
    }

    @Override
    public Groups read(Long id) {
        return groupRepo.findById(id).get();
    }

    @Override
    public List<Groups> readAll() {
        return groupRepo.findAll();
    }

    @Override
    public void save(Groups entity) {
        groupRepo.save(entity);
    }

    @Override
    public void delete(Long id) {
        groupRepo.deleteById(id);
    }

    @Override
    public void edit(Groups entity) {
        Groups group = groupRepo.findById(entity.getId()).orElseThrow(IllegalArgumentException::new);
        group.setGrName(entity.getGrName());
        groupRepo.save(group);
    }
}
