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
public class Client {
    
    private ArrayList<BankAccount> listOfAccounts;

    public Client(ArrayList<BankAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }

    public ArrayList<BankAccount> getListOfAccounts() {
        return listOfAccounts;
    }

    public void setListOfAccounts(ArrayList<BankAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }
    
    
}
