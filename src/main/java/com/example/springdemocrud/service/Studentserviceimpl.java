package com.example.springdemocrud.service;

import com.example.springdemocrud.model.Studentmodel;
import com.example.springdemocrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimpl implements Studentservice {
    @Autowired(required = true)
    StudentRepository studentRepository;


    public void addStudent(Studentmodel studentmodel) {
        studentRepository.insert(studentmodel);
    }

    public void updateStudent(Studentmodel studentmodel, String id) {
        Studentmodel savedStudentmodel = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        String.format("cann't find id..")));
        savedStudentmodel.setStudentName(studentmodel.getStudentName());
        savedStudentmodel.setId(studentmodel.getId());
        studentRepository.save(savedStudentmodel);
    }

    public List<Studentmodel> getAllStudent() {
        return studentRepository.findAll();
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);

    }

    public Optional<Studentmodel> getStudent(String id) {
        return studentRepository.findById(id);
    }

    public String deleteStudent() {
        studentRepository.deleteAll();
        return "deleted..";
    }

    @Override
    public Optional<Studentmodel> findStudentModel() {
        return Optional.empty();
    }

}


