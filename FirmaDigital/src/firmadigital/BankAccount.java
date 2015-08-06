/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmadigital;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Soler
 */
public class BankAccount {
 
    private int id;
    private Client client;
    private Bank bank;
    private Currency currency;
    private int amount;
    private ArrayList<Transaction> listOfTransactions;
    private Calendar registeredDate;
    private Calendar expirationDate;

    public BankAccount() {
    }

    public BankAccount(int id, Client client, Bank bank, Currency currency, int amount, ArrayList<Transaction> listOfTransactions, Calendar registeredDate, Calendar expirationDate) {
        this.id = id;
        this.client = client;
        this.bank = bank;
        this.currency = currency;
        this.amount = amount;
        this.listOfTransactions = listOfTransactions;
        this.registeredDate = registeredDate;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ArrayList<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    public void setListOfTransactions(ArrayList<Transaction> listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }

    public Calendar getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Calendar registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", client=" + client + ", bank=" + bank + ", currency=" + currency + ", amount=" + amount + ", listOfTransactions=" + listOfTransactions + ", registeredDate=" + registeredDate + ", expirationDate=" + expirationDate + '}';
    }
    
    
    
}
