package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(20000);
        while (true) {
            try {
                user1.withDraw(6000);
                System.out.println(user1.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage() + " Было списано " + e.getRemainingAmount());
                break;
            }

        }

    }
}
