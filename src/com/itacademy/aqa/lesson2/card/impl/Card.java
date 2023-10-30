package com.itacademy.aqa.lesson2.card.impl;

import com.itacademy.aqa.lesson2.card.Cardable;

import java.util.Objects;

public abstract class Card implements Cardable {
    private String owner;
    private double balance;

    public Card(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public Card(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Double.compare(card.balance, balance) == 0 && Objects.equals(owner, card.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
