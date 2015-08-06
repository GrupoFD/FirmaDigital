/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmadigital;

import java.util.ArrayList;

/**
 *
 * @author Soler
 */
public class User {

    protected int id;
    protected String name;
    protected String password;
    protected int salary;
    protected String workShift;

    public User() {
    }

    public User(int id, String name, String passwprd, int salary, String workShift) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.workShift = workShift;
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

    public String getPasswprd() {
        return password;
    }

    public void setPasswprd(String passwprd) {
        this.password = passwprd;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", salary=" + salary + ", workShift=" + workShift + '}';
    }

    
}

