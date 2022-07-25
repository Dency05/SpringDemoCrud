package com.example.springdemocrud.repository;

import com.example.springdemocrud.model.Studentmodel;

import java.util.List;

public interface StudentRepositoryCustom {
    List<Studentmodel> findStudentModel(String id);
}
