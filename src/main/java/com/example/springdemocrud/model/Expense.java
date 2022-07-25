package com.example.springdemocrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@AllArgsConstructor
@Document(collection = "expense")
public class Expense {
    @Id
    private  String id;
    @Field(name ="name")
    @Indexed(unique = true)
    private  String name;
    @Field(name="category")
    private ExpenseCategory expenseCategory;
    @Field(name="amount")
    private double expenseAmount;
}

