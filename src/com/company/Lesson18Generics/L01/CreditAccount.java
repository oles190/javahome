package com.company.Lesson18Generics.L01;

public class CreditAccount extends Account<Integer>{
    public CreditAccount(Integer id, int sum) {
        super(id, sum);
    }

    public CreditAccount(Integer id) {
        super(id);
    }
}

