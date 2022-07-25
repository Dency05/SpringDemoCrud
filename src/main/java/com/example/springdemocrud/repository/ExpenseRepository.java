package com.example.springdemocrud.repository;

import com.example.springdemocrud.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Repository
public interface ExpenseRepository extends MongoRepository<Expense,String> {

}

