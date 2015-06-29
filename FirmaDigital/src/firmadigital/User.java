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
    
    protected String name;
    protected Certificate certificate;
    protected ArrayList<Documents> documents;
    protected ArrayList<BankAccount> bankAccount;

    public User(String name, Certificate certificate, ArrayList<Documents> documents, ArrayList<BankAccount> bankAccount) {
        this.name = name;
        this.certificate = certificate;
        this.documents = documents;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public ArrayList<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Documents> documents) {
        this.documents = documents;
    }

    public ArrayList<BankAccount> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(ArrayList<BankAccount> bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", certificate=" + certificate + ", documents=" + documents + ", bankAccount=" + bankAccount + '}';
    }
    
    
    
    
}
