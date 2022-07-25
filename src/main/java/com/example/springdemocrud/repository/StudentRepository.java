package com.example.springdemocrud.repository;

import com.example.springdemocrud.model.Studentmodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Studentmodel ,String> ,StudentRepositoryCustom{


}
