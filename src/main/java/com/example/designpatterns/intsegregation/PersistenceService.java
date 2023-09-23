package com.example.designpatterns.intsegregation;

public interface PersistenceService<T> {

    void save(T entity);
    void delete(Long id);

}
