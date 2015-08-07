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
public class FirmaDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person p = new Person("123213", "Carlos", "213", "qwdqwd", Calendar.getInstance(), 123);
        Bank easyBank = new Bank();
        BankAccount b = new BankAccount(123, 2, 1234, Calendar.getInstance(), Calendar.getInstance());
        //p.getlistOfBankAccounts().add(b);
        
        p.getId();
        p.getPassword();
        
        if (p.getId().equals("123213")) {
            
            System.out.println("NOMBRE: " + p.getName());
            
            if (p.getPassword().equals("213")) {
                
                System.out.println("LOGIN");
                
            }else{System.out.println("Invalid PASS");}
            
            
        }else{
            
            System.out.println("NO LOGIN");
        
        }
        
        System.out.println("" + p.getlistOfBankAccounts());

    }

}
