package com.oop.projects.Practical_Activity_Generics;

import java.util.List;

public interface ICllient<T> {
    void add(T t);
    List<T> getAll();
    T findById(long id);
    void removeById(long id);
}
