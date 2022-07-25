package com.example.springdemocrud.service;

import com.example.springdemocrud.model.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public interface Expenseservice  {
    void addExpense(Expense expense);
     void updateExpense(Expense expense ,String id);
     List<Expense> getAllExpense();
    void deleteExpense(String id);
   Optional<Expense> getExpense(String id);
   String deleteExpenses();
   Page<Expense> getAllExpensePagination(Pageable pageable);


}
