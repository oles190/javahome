package com.company.Lesson18Generics.L01;

public class DebitAccount extends  Account<String> {
    public DebitAccount(String id, int sum) {
        super(id, sum);
    }

    public DebitAccount(String id) {
        super(id);
    }
}
