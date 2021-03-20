package com.company.Lesson13InteratorComperator;

import java.util.Comparator;

public class SortByLength implements Comparator<Commodity> {

    @Override
    public int compare(Commodity length1, Commodity length2) {
            return length1.getLength() - length2.getLength();

        }
    }
