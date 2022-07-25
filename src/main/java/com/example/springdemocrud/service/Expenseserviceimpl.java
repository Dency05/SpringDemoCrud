package com.example.springdemocrud.service;

import com.example.springdemocrud.model.Expense;
import com.example.springdemocrud.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Expenseserviceimpl implements Expenseservice {

    @Autowired(required = true)
    ExpenseRepository expenseRepository;


    public void addExpense(Expense expense){
            expenseRepository.insert(expense);
        }
        public void updateExpense(Expense expense ,String id){
            Expense savedExpense = expenseRepository.findById(id)
                    .orElseThrow(()->new RuntimeException(
                            String. format("cann't find id..")));

            savedExpense.setExpenseCategory(expense.getExpenseCategory());
            savedExpense.setExpenseAmount(expense.getExpenseAmount());
            savedExpense.setName(expense.getName());
            expenseRepository.save(savedExpense);
        }

        public List<Expense> getAllExpense(){
            return  expenseRepository.findAll();
        }
        public void deleteExpense(String id){
            expenseRepository.deleteById(id);

        }
        public  Optional<Expense>getExpense(String id){
            return expenseRepository.findById(id);
        }
        public String deleteExpenses(){
            expenseRepository.deleteAll();
            return "deleted..";
        }
        public Page<Expense> getAllExpensePagination(Pageable pageable){

        return expenseRepository.findAll(pageable);
         }

    }


