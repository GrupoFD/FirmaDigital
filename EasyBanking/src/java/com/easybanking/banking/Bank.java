/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

import java.util.ArrayList;

/**
 *
 * @author Soler
 */
public class Bank {
    
    private int id;
    private String name;
    private String country;
    private int phone;
    private ArrayList<Person> listOfPersons;
    
    
    
    
    public Bank() {
    }

    public Bank(int id, String name, String country, int phone) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", name=" + name + ", country=" + country + ", phone=" + phone + '}';
    }
    
    
}
