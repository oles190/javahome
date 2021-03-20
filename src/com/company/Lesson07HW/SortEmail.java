package com.company.Lesson07HW;

import java.util.Comparator;

public class SortEmail implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getEmail().length() > user2.getEmail().length()) {
            return -1;
        }
            if (user1.getEmail().length() == user2.getEmail().length()) {
                return 0;
            }
            return 1;

    }
}
