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
public class WorkShift {
   
    private String name;
    private Calendar dayTime;
    private Calendar workTime;
    private int extraSalary;

    public WorkShift() {
    }

    public WorkShift(String name, Calendar dayTime, Calendar workTime, int extraSalary) {
        this.name = name;
        this.dayTime = dayTime;
        this.workTime = workTime;
        this.extraSalary = extraSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDayTime() {
        return dayTime;
    }

    public void setDayTime(Calendar dayTime) {
        this.dayTime = dayTime;
    }

    public Calendar getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Calendar workTime) {
        this.workTime = workTime;
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    @Override
    public String toString() {
        return "WorkShift{" + "name=" + name + ", dayTime=" + dayTime + ", workTime=" + workTime + ", extraSalary=" + extraSalary + '}';
    }
    
    
    
}
