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
public class Legal extends Person{
    
    private String responsible;

    public Legal(String id, String name, String password, String direction, Calendar birthDate, int phone, String responsible) {
        super(id, name, password, direction, birthDate, phone);
        this.responsible = responsible;
    }
 
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
    
    
    
    
}
