package com.itacademy.aqa.lesson2.card.impl;

public class DebitCard extends Card {
    public DebitCard(String owner, double balance) {
        super(owner, balance);
    }

    public DebitCard(String owner) {
        super(owner);
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
    public double withdraw(double amount) throws InsufficientFundsException {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return getBalance();
        } else {
            throw new InsufficientFundsException("Insufficient funds");
        }
    }

    @Override
    public double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
