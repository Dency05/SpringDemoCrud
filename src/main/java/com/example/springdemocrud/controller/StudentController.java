package com.example.springdemocrud.controller;
import com.example.springdemocrud.model.Studentmodel;
import com.example.springdemocrud.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired(required = true)
    Studentservice studentservice;

    @PostMapping("/add")
    public String addStudnet(@RequestBody Studentmodel studentmodel) {
        studentservice.addStudent(studentmodel);
        return "record inserted..";
    }
    @PutMapping("/{id}")
    public String updateStudent(@RequestBody Studentmodel studentmodel,@PathVariable  String id){
        studentservice.updateStudent(studentmodel,id);
        return "updated successfully..";
    }
    @GetMapping
    public ResponseEntity<List<Studentmodel>> getallStudent() {
        return ResponseEntity.ok(studentservice.getAllStudent());
    }
    @GetMapping("/student/")
    public Optional<Studentmodel> getStudent( @RequestParam String id) {
        return studentservice.getStudent(id);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable  String id){
        studentservice.deleteStudent(id);
        return "deleted id is :  " +id;
    }
    @DeleteMapping
    public String deleteStudent(){
        return studentservice.deleteStudent();
    }
    @GetMapping("/studentmodel")
    public Optional<Studentmodel> findStudentModel(){
        return studentservice.findStudentModel();
    }

}

