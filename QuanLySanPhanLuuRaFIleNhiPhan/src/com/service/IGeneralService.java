package com.service;

import java.util.List;

public interface IGeneralService<T> {
    public List<T> findAll();
    public T findById(int id);
    public void add(T t);
    public void update(T t);
    public void delete(int id);
}
