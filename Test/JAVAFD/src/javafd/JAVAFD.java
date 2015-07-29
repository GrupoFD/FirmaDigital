/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.util.io.pem.PemReader;

/**
 *
 * @author Soler
 */
public class JAVAFD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            getFile();
        } catch (IOException ex) {
            Logger.getLogger(JAVAFD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void getFile() throws FileNotFoundException, IOException{
    
   
        FileReader file = new FileReader("/Users/Soler/Desktop/U/Progra/CertificadosDePrueba/Certificados Buenos/PersonasFisicas/ANA ROJAS PRUEBA (AUTENTICACION).pfx");
        FileReader file2 = new FileReader("/Users/Soler/Desktop/U/Progra/CertificadosDePrueba/Certificados Buenos/PersonasFisicas/JUAN PEREZ PRUEBA (AUTENTICACION).pfx");
            
        PemReader pem = new PemReader(file);
        PemReader pem2 = new PemReader(file2);
        
        
        
        if (pem.equals(pem2)) {
            
            System.out.println("Login");
            
        }else{
        
            System.out.println("Invalid User \n");
        
        }
        
        System.out.println("HASH "+pem.hashCode()+ " tostring " +pem.toString() +" PEM read "+ pem.readLine()); 
        System.out.println("HASH "+pem2.hashCode()+ " tostring " +pem2.toString()); 
        
    }
}

