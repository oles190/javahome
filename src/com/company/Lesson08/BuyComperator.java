package com.company.Lesson08;

import java.util.Comparator;

public class BuyComperator implements Comparator<Buy> {

    @Override
    public int compare(Buy buy1, Buy buy2) {
        if (buy1.getName().length() > buy2.getName().length()) {
            return -1;
        }

        if (buy1.getName().length() == buy2.getName().length()) {
            return 0;


    }
        return 1;
}
    }