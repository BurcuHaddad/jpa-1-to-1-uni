package com.devbh.cruddemo.dao;

import com.devbh.cruddemo.entity.Instructor;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
}
