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
public class Withdraw extends Transaction{

    public Withdraw(Calendar timeStamp, double amountOfTransaction) {
        super(timeStamp, amountOfTransaction);
    }
    
      public void withdrawAmount(Person person, BankAccount bankAccount){
    
        for (BankAccount b: person.getlistOfBankAccounts()) {
            
            if (b.equals(bankAccount)) {
                
                double amount = b.getAmount();
                
                if (amount >= getAmountOfTransaction()) {
                    
                    double finalAmount = b.getAmount() - this.getAmountOfTransaction();
                    b.setAmount(finalAmount);
                    
                }else{
                    
                    System.out.println("EXCEPTION");
                
                }

                
            }
            
        }
        
    }
    
}
