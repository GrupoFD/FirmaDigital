/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Soler
 */
public abstract class Person {
    
    private String id;
    private String name;
    private String password;
    private String direction;
    private Calendar birthDate;
    private int phone;
    private ArrayList<BankAccount> listOfBankAccounts;

    public Person() {
    }

    public Person(String id, String name, String password, String direction, Calendar birthDate, int phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.direction = direction;
        this.birthDate = birthDate;
        this.phone = phone;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
     public ArrayList<BankAccount> getlistOfBankAccounts() {
        return listOfBankAccounts;
    }

    public void setListOfAccounts(ArrayList<BankAccount> listOfBankAccounts) {
        this.listOfBankAccounts = listOfBankAccounts;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", password=" + password + ", direction=" + direction + ", birthDate=" + birthDate + ", phone=" + phone + ", listOfBankAccounts=" + listOfBankAccounts + '}';
    }
    
}
