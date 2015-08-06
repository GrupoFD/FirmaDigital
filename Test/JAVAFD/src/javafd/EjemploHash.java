/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafd;

import java.security.*;

import javax.crypto.*;
import javax.crypto.interfaces.*;
import javax.crypto.spec.*;

import java.io.*;
import static java.lang.System.in;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


public class EjemploHash {
    /*  Ejemplo de uso de funciones de resumen Hash
     *  carga el fichero que recibe como parametro y genera el resumen
     */
    public static void main(String[] args) throws Exception {
        // Comprobar argumentos
        if (args.length != 1) {
            mensajeAyuda();
            System.exit(1);
        }

        /* Cargar "provider" (sólo si no se usa el que viene por defecto) */
        Security.addProvider(new BouncyCastleProvider());  // Usa provider BC
        
        /* Crear función resumen */
        //MessageDigest messageDigest = MessageDigest.getInstance("MD5"); // Usa MD5
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1"); // Usar SHA-1

        /* Leer fichero de 1k en 1k y pasar fragmentos leidos a la funcion resumen */
        byte[] buffer = new byte[1000];
        int leidos = in.read(buffer, 0, 1000);
        while (leidos != -1) {
            messageDigest.update(buffer); // Pasa texto claro a la función resumen
            leidos = in.read(buffer, 0, 1000);
        }
        in.close();
            
        byte[] resumen = messageDigest.digest(); // Completar el resumen

        // Mostrar resumen
        System.out.println("RESUMEN:");
        mostrarBytes(resumen);
        System.out.println();
    }

    public static void mostrarBytes(byte [] buffer) {
        System.out.write(buffer, 0, buffer.length);
    } 
    
    public static void mensajeAyuda() {
        System.out.println("Ejemplo funciones Hash");
        System.out.println("\tSintaxis:   java EjemploHash fichero");
        System.out.println();
    }

}