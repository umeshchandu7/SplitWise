package com.scaler.Splitwise.Services.initialiseservice;

import com.scaler.Splitwise.Models.*;
import com.scaler.Splitwise.Repositories.ExpenseRepository;
import com.scaler.Splitwise.Repositories.GroupRepository;
import com.scaler.Splitwise.Repositories.UserExpenseRepository;
import com.scaler.Splitwise.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserExpenseRepository userExpenseRepository;
    public void initialise()
    {
            User user1 = new User();
            user1.setEmail("umeshdmc7@gmail.com");
            user1.setName("umesh");
            user1.setPhoneNumber("9959966921");
            userRepository.save(user1);
        User user2 = new User();
        user2.setEmail("deeshu@gmail.com");
        user2.setName("Jagadeesh");
        user2.setPhoneNumber("9440059295");
        userRepository.save(user2);
        User user3 = new User();
        user3.setEmail("vijaya@gmail.com");
        user3.setName("vijaya");
        user3.setPhoneNumber("8121151022");
        userRepository.save(user3);
        User user4 = new User();
        user4.setEmail("nagesh@gmail.com");
        user4.setName("nagesh");
        user4.setPhoneNumber("9030685485");
        userRepository.save(user4);
        Group g1 = new Group();
        g1.setName("Incredibles");
        g1.setDescription("Trip");
        g1.setUsers(List.of(user1,user2,user3,user4));
//        groupRepository.save(g1);
        UserExpense userExpense1 = new UserExpense();
        userExpense1.setAmount(1000);
        userExpense1.setUser(user1);
        userExpense1.setUserExpenseType(UserExpenseType.PAID);
        userExpenseRepository.save(userExpense1);
        UserExpense userExpense2 = new UserExpense();
        userExpense2.setAmount(1000);
        userExpense2.setUser(user2);
        userExpense2.setUserExpenseType(UserExpenseType.PAID);
        userExpenseRepository.save(userExpense2);
        UserExpense userExpense3 = new UserExpense();
        userExpense3.setAmount(500);
        userExpense3.setUser(user1);
        userExpense3.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense3);
        UserExpense userExpense4 = new UserExpense();
        userExpense4.setAmount(500);
        userExpense4.setUser(user2);
        userExpense4.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense4);
        UserExpense userExpense5 = new UserExpense();
        userExpense5.setAmount(500);
        userExpense5.setUser(user3);
        userExpense5.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense5);
        UserExpense userExpense6 = new UserExpense();
        userExpense6.setAmount(500);
        userExpense6.setUser(user4);
        userExpense6.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense6);
        Expense expense1 = new Expense();
        expense1.setAmount(2000);
        expense1.setDescription("food");
        expense1.setCurrency(Currency.INR);
        expense1.setUserExpenses(List.of(userExpense1,userExpense2,userExpense3,userExpense4,userExpense5,userExpense6));
//        expense1.setGroup(g1);
        expenseRepository.save(expense1);
        UserExpense userExpense7 = new UserExpense();
        userExpense7.setAmount(2000);
        userExpense7.setUser(user1);
        userExpense7.setUserExpenseType(UserExpenseType.PAID);
        userExpenseRepository.save(userExpense7);
        UserExpense userExpense8 = new UserExpense();
        userExpense8.setAmount(1000);
        userExpense8.setUser(user2);
        userExpense8.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense8);
        UserExpense userExpense9 = new UserExpense();
        userExpense9.setAmount(500);
        userExpense9.setUser(user3);
        userExpense9.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense9);
        UserExpense userExpense10 = new UserExpense();
        userExpense10.setAmount(500);
        userExpense10.setUser(user4);
        userExpense10.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpenseRepository.save(userExpense10);
        Expense expense2 = new Expense();
        expense2.setAmount(2000);
        expense2.setDescription("travel");
        expense2.setCurrency(Currency.INR);
        expense2.setUserExpenses(List.of(userExpense7,userExpense8,userExpense9,userExpense10));
//        expense2.setGroup(g1);
        expenseRepository.save(expense2);
        g1.setExpenses(List.of(expense1,expense2));
        g1.setTotalAmountSpend(2000);
        groupRepository.save(g1);

    }
}
