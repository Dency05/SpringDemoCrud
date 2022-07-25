package com.example.springdemocrud.repository;

import com.example.springdemocrud.model.Studentmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryCustomImpl implements  StudentRepositoryCustom{

@Autowired
    MongoTemplate mongoTemplate;
    @Override
    public List<Studentmodel> findStudentModel(String id) {
        Query query= new Query();
        Criteria criteria=new Criteria();//match
        criteria.and("id").is("62d52f2f8bda1b3279f548c2");
        query.addCriteria(criteria);
        return mongoTemplate.find(query, Studentmodel.class);

    }
}
