package com.example.springdemocrud.controller;

import com.example.springdemocrud.model.Expense;
import com.example.springdemocrud.model.Studentmodel;
import com.example.springdemocrud.service.Expenseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
    public class ExpenseController
    {
        @Autowired(required = true)
        Expenseservice expenseService;

        @PostMapping("/add")
        public String addExpense(@RequestBody Expense expense) {
            expenseService.addExpense((expense));
            return "record inserted..";
        }
        @PutMapping("/{id}")
        public String updateExpense(@RequestBody Expense expense,@PathVariable  String id){
            expenseService.updateExpense(expense,id);
            return "updated successfully..";
        }
         @GetMapping
        public ResponseEntity <List<Expense>>getallExpense() {
        return ResponseEntity.ok(expenseService.getAllExpense());
        }
         @GetMapping("/{id}")
         public Optional<Expense> getExpense(@PathVariable String id){
            return expenseService.getExpense(id);
        }
        @DeleteMapping("/{id}")
        public String deleteExpense(@PathVariable  String id){
                expenseService.deleteExpense(id);
                return "deleted id is :  " +id;
        }
        @DeleteMapping
        public String deleteExpenses(){
            return expenseService.deleteExpenses();
            }

        @GetMapping("/find")
        public Page<Expense> conceptpagination (Pageable pageable){
            return expenseService.getAllExpensePagination(pageable);
        }

    }
