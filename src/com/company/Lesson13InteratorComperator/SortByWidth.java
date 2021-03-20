package com.company.Lesson13InteratorComperator;

import java.util.Comparator;

public class SortByWidth implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getWidth()> o2.getWidth()) {
            return 1;
        }
        if (o1.getWidth() == o2.getWidth()) {
            return 0;
        }
        return -1;

    }
}