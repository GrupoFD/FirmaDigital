/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

import java.util.Calendar;

/**
 *
 * @author Soler
 */
public class Deposit extends Transaction {

    public Deposit(Calendar timeStamp, double amountOfTransaction) {
        super(timeStamp, amountOfTransaction);
    }

    public void depositAmount(Person person, BankAccount bankAccount) {

        for (BankAccount b : person.getlistOfBankAccounts()) {

            if (b.equals(bankAccount)) {

                double amount = b.getAmount();

                double finalAmount = b.getAmount() + this.getAmountOfTransaction();

            }

        }

    }

}
