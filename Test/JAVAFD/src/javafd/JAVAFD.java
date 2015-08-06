/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemReader;


/**
 *
 * @author Soler
 */
public class JAVAFD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws KeyStoreException, NoSuchProviderException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException {
        
        String path = "/Users/Soler/Desktop/U/Progra/CertificadosDePrueba/Certificados Buenos/PersonasFisicas/ANA ROJAS PRUEBA (AUTENTICACION).pfx";
    char[] pass = "123".toCharArray();
    char[] pass2 = "165".toCharArray();

    BouncyCastleProvider provider = new BouncyCastleProvider();
    Security.addProvider(provider);
    KeyStore ks = KeyStore.getInstance("pkcs12", provider.getName());
    ks.load(new FileInputStream(path), pass);
    String alias = (String) ks.aliases().nextElement(); /* alias='CCA India 2011\u0000'*/
    PrivateKey pk = (PrivateKey) ks.getKey(alias, pass);/* returns null */
        java.security.cert.Certificate[] chain = ks.getCertificateChain(alias);/* returns null */
    X509Certificate last = (X509Certificate) chain[chain.length - 1];
        System.out.println( " ---- " + ks.getKey(alias, pass) );
        
        if (ks.getKey(alias, pass2)==pk) {
            System.out.println("LOGIN");
            
            
        }else{
        
            System.out.println("NO LOGIN");
        
        }
        
    System.out.println(last.getNotBefore());
    System.out.println(last.getNotAfter());
    
        try {
            // TODO code application logic here
            getFile();
           
        } catch (IOException ex) {
            //Logger.getLogger(JAVAFD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void getFile() throws FileNotFoundException, IOException {

        //FileReader file = new FileReader("C:\\Users\\Soler\\Documents\\GitHub\\FirmaDigital\\CertificadosDePrueba\\Certificados Buenos\\PersonasFisicas\\ANA ROJAS PRUEBA (AUTENTICACION).pfx");
        
        //MAC ONLY
        FileReader file = new FileReader("/Users/Soler/Desktop/U/Progra/CertificadosDePrueba/Certificados Buenos/PersonasFisicas/JUAN PEREZ PRUEBA (AUTENTICACION).pfx");
        
        PemReader pem = new PemReader(file);
        //PemReader pem2 = new PemReader(file2);
        X509Certificate x = null;
       
       
       
        
//           File f = new File("C:\\Users\\Soler\\Documents\\GitHub\\FirmaDigital\\CertificadosDePrueba\\Certificados Buenos\\PersonasFisicas\\ANA ROJAS PRUEBA (AUTENTICACION).pfx");
//        FileInputStream fis = new FileInputStream(f);
//        DataInputStream dis = new DataInputStream(fis);
//        byte[] keyBytes = new byte[(int) f.length()];
//        dis.readFully(keyBytes);
//        dis.close();
//        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
//        KeyFactory kf
//                = KeyFactory.getInstance("RSA");
//        System.out.println(kf.generatePrivate(spec));
        
        if (pem.equals(pem)) {
            
            System.out.println("Login");
            
        }else{
        
            System.out.println("Invalid User \n");
        
        }
        
        System.out.println("HASH " + pem.hashCode() + " tostring " + pem.toString() + " PEM read " + pem.read());
        //System.out.println("HASH "+pem2.hashCode()+ " tostring " +pem2.toString()); 

    }
    
   
}
