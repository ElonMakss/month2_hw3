package com.company;

public class BankAccount {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = this.amount + sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (this.amount > sum) {
            this.amount = this.amount - sum;
        } else {
            double am = this.amount;
            this.amount = this.amount - this.amount;
            throw new LimitException("Недостаточно средств", am);
        }
    }
}
