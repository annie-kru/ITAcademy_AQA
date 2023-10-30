package com.itacademy.aqa.lesson2.card.impl;

public class CreditCard extends Card {
    private double debt;
    public CreditCard(String owner, double balance, double debt) {
        super(owner, balance);
        this.debt = debt;
    }
    public CreditCard(String owner, double balance){
        super(owner, balance);
        this.debt = 100.00;
    }
    public CreditCard(String owner) {
        super(owner);
        this.debt = 100.00;
    }

    @Override
    public double showBalance() {
        return getBalance();
    }

    @Override
    public double deposit(double amount) {
        setBalance(getBalance() + amount);
        return getBalance();
    }

    @Override
    public double withdraw(double amount)throws InsufficientFundsException {
        if (amount <= (getDebt() + getBalance())) {
            setBalance(getBalance() - amount);
            return getBalance();
        } else {
            throw new InsufficientFundsException("Overdraft limit is exceeded.");
        }
    }

    @Override
    public double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
