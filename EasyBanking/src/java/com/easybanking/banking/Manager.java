/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

/**
 *
 * @author Soler
 */
public class Manager extends User{
    
    private int extraSalary;

    public Manager() {
    }

    public Manager(int extraSalary, int id, String name, String password, int salary, String workShift) {
        super(id, name, password, salary, workShift);
        this.extraSalary = extraSalary;
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" + "extraSalary=" + extraSalary + '}';
    }
    
    
    
}
