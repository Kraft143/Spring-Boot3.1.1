package ru.aslanov.springboot311.web.dao;

import ru.aslanov.springboot311.web.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
