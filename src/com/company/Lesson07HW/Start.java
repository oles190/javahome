package com.company.Lesson07HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("NewDeliver"));
        list.add(new User("Deliver"));
        list.add(new User("NewNewNewNewNew"));


        Collections.sort(list, new SortEmail());

        for (User user : list) {
            System.out.println(user.getEmail());
        }


    }
}