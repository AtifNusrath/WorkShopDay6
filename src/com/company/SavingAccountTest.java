package com.company;

class SavingAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();


        System.out.println("This month:\nSaver 1 balance= " + saver1.getSavingBalance());
        System.out.println("Saver 2 balance= " + saver2.getSavingBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next month:\nSaver 1 balance= " + saver1.getSavingBalance());
        System.out.println("Saver 2 balance= " + saver2.getSavingBalance());

    }
}