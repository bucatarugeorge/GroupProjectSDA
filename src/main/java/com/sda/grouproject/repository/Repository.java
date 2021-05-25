package com.sda.grouproject.repository;

import com.sda.grouproject.model.Game;

import java.util.List;

public interface Repository<T> {
    void save(T object);
    void delete(T object);
    void update(T object);
}
