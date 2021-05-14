package org.example.service;

import org.example.entity.AbstractEntity;

import java.util.List;

public interface Service <T extends AbstractEntity>{
    T read(Long id);
    List<T> readAll();
    void save (T entity);
    void  delete (Long id);
    void edit (T entity);
}
