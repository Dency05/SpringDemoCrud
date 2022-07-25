package com.example.springdemocrud.service;


import com.example.springdemocrud.model.Studentmodel;

import java.util.List;
import java.util.Optional;

public interface Studentservice {
     void addStudent(Studentmodel studentmodel);
      void updateStudent(Studentmodel studentmodel, String id);
    List<Studentmodel> getAllStudent();
    void deleteStudent(String id);
    Optional<Studentmodel> getStudent(String id);
    String deleteStudent();
    Optional<Studentmodel> findStudentModel();
}
