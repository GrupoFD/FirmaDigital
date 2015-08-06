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
public class Legal extends Client{
    
    private String responsible;

    public Legal() {
    }
    
    public Legal(String responsible, String id, String name, String password, String direction, Calendar birthDate, int phone, ArrayList<BankAccount> listOfAccounts) {
        super(id, name, password, direction, birthDate, phone, listOfAccounts);
        this.responsible = responsible;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
    
    
    
    
}
