package com.example.springdemocrud.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "StudentStore")
public class Studentmodel {
    @Id
    private String id;
    private String StudentName;

}
