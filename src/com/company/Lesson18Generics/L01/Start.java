package com.company.Lesson18Generics.L01;


import java.util.*;

public class Start {


    public static void main(String[] args) {

        Map<User, Account<?>> accounts = new HashMap<>();
        accounts.put(new User("Oles", "Doskuch", 19), new Account<String>("24214214", 232312));
        accounts.put(new User("Oles1", "Doskuch1", 20), new CreditAccount(432423, 45435));
        accounts.put(new User("Oles2", "Doskuch2", 21), new DebitAccount("324523", 3423));

        UserService<Account<?>,User> service =new UserService<>();
        service.printAllAccount(accounts.values());
        service.printAllUsers(accounts.keySet());

for(Map.Entry<User,Account<?>> element:accounts.entrySet()){
    System.out.println(  service.GetCharge(element.getValue()));
        }
    }
}