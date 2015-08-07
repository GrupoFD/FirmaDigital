
package com.easybanking.banking;

import java.util.Calendar;

/**
 *
 * @author Glenn
 */
public class Transaction {
    
//     Transacción existe básicamente para DOS RAZONES (por ahora)..!!
//     PRIMERO,,, para que en el tester (un servlet?) exista un único objeto declarado de
//     Transaccion miTransaccion... Cada vez que se haga una transacción, se llenan los atributos
//     de este objeto y se usa alguno o algunos de sus métodos para llevar a cabo la transacción
//     que sea... Y todos los resultados se almacenan en el objeto, quedando un record completo..!!!
//     SEGUNDA razón... Cada cuenta va a tener una lista de transacciones...
//     (Según instrucción del Profe, Banco tiene lista de personas, Persona tiene lista de cuentas y Cuenta tiene lista de transacciones..!!!)
//     Cada vez que se llena y completa un objeto transacción mediante la razón PRIMERA,
//     mediante un add, se mete el registro de la transacción en la lista de transacciones de la cuenta ACTIVA...
//    
//     Cuenta activa es la cuenta del que hace una transacción
//     Cuenta pastiva es la cuenta de una persona registrada que recibe una transacción (como recibir una transferencia)
//     userActive es el que saca dinero y lo mete en la cuenta de otro...
//     userPasive es el que, sin hacer nada, recibe dinero...
//    
//     Tipo de transacción se almacena en la variable typeOfTransaccion: 1 = deposito, 2 = retiro, 3 = transferencia...
    
//    private Person userActive;
//    private Person userPasive;
//    private BankAccount accountActive;
//    private BankAccount accountPassive;
//    private int typeOfTransaction; 
//    No lo ocupamos porq ya viene desde BANKACCOUNT 
    
    private Calendar timeStamp;
    private double amountOfTransaction;

    public Transaction() {
    }

    public Transaction(Calendar timeStamp, double amountOfTransaction) {
             this.timeStamp = timeStamp;
          this.amountOfTransaction = amountOfTransaction;
    }

//    public Person getUserActive() {
//        return userActive;
//    }
//
//    public void setUserActive(Person userActive) {
//        this.userActive = userActive;
//    }
//
//    public Person getUserPasive() {
//        return userPasive;
//    }
//
//    public void setUserPasive(Person userPasive) {
//        this.userPasive = userPasive;
//    }
//
//    public BankAccount getAccountActive() {
//        return accountActive;
//    }
//
//    public void setAccountActive(BankAccount accountActive) {
//        this.accountActive = accountActive;
//    }
//
//    public BankAccount getAccountPassive() {
//        return accountPassive;
//    }
//
//    public void setAccountPassive(BankAccount accountPassive) {
//        this.accountPassive = accountPassive;
//    }

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }
//
//    public int getTypeOfTransaction() {
//        return typeOfTransaction;
//    }
//
//    public void setTypeOfTransaction(int typeOfTransaction) {
//        this.typeOfTransaction = typeOfTransaction;
//    }

    public double getAmountOfTransaction() {
        return amountOfTransaction;
    }

    public void setAmountOfTransaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }

    // NO VER MUCHO ESTOS METODOS PORQUE HAY QUE CAMBIARLOS MUCHO...!!!!
    // NO VER MUCHO ESTOS METODOS PORQUE HAY QUE CAMBIARLOS MUCHO...!!!!
    // NO VER MUCHO ESTOS METODOS PORQUE HAY QUE CAMBIARLOS MUCHO...!!!!
    
    /*
    
    public void performDeposit(Transaction myTransaction) {

        boolean estaCorrecto = false;
        String cedula = "";
        String numeroCuenta = "";
        double montoDeposito = 0.0;
        int respuesta = 999;

        while (estaCorrecto == false) {

            cedula = gestor.solicitarInformación("Ingrese su numero de cedula con 9 digitos, tal y como aparece en el documento de identificacion, pero sin los espacios");
            numeroCuenta = gestor.solicitarInformación("Ingrese su numero de cuenta con el formato exacto (4 dígitos, un guión y 4 digitos). Ej: 0000-0099");
            montoDeposito = gestor.solicitarNumeroDouble("Ingrese el monto de su deposito; el mismo debe ser mayor a 0 unidades de su moneda");

            
            for (Cuenta miCuenta: arregloDeCuentas) {
                if (miCuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta)) {
                    if (miCuenta.getCedula().equalsIgnoreCase(cedula)) {
                        estaCorrecto = true;
                    }
                }
            }
            
            
            
            if (estaCorrecto == false) {
                respuesta = gestor.mostrarMensajeError("Existen datos incorrectos. ¿Desea continuar?");
                if (respuesta == 0) {
                    estaCorrecto = false;
                }
                if ((respuesta == 1) || (respuesta == 2)) {
                    estaCorrecto = true;
                }
            }

        }

        if ((estaCorrecto == true) && (respuesta == 999)) {
            actualizarSaldoActual(montoDeposito, numeroCuenta);
            estaCorrecto = true;
            gestor.mostrarMensaje("El deposito ha sido realizado con exito");
            actualizarHistorial(numeroCuenta, montoDeposito, cedula, manejadorCliente);
        }

    }

    
    public void performWithdrawal(Transaction myTransaction) {

        boolean estaCorrecto = false;
        String cedula = "";
        String numeroCuenta = "";
        double montoRetiro = 0.0;
        int respuesta = 999;

        while (estaCorrecto == false) {

            cedula = gestor.solicitarInformación("Ingrese su numero de cedula con 9 digitos, tal y como aparece en el documento de identificacion, pero sin los espacios");
            numeroCuenta = gestor.solicitarInformación("Ingrese su numero de cuenta con el formato exacto (4 dígitos, un guión y 4 digitos). Ej: 0000-0099");
            montoRetiro = gestor.solicitarNumeroDouble("Ingrese el monto de su retiro; el mismo debe ser menor o igual al saldo de su cuenta");

            
            for (BankAccount myAccount: arregloDeCuentas) {
                if (miCuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta)) {
                    if (miCuenta.getCedula().equalsIgnoreCase(cedula)) {
                        estaCorrecto = true;
                    }
                }
            }
            
            
            
            if (estaCorrecto == false) {
                respuesta = gestor.mostrarMensajeError("Existen datos incorrectos o su saldo es menor al monto del retiro. ¿Desea continuar?");
                if (respuesta == 0) {
                    estaCorrecto = false;
                }
                if ((respuesta == 1) || (respuesta == 2)) {
                    estaCorrecto = true;
                }
            }

        }

        if ((estaCorrecto == true) && (respuesta == 999)) {
            actualizarSaldoActual(-montoRetiro, numeroCuenta);
            gestor.mostrarMensaje("El retiro ha sido realizado con exito");
            actualizarHistorial(numeroCuenta, -montoRetiro, cedula, manejadorCliente);
            estaCorrecto = true;
        }

    }
    
    
    private void transferSavings(BankAccount account_origen, BankAccount account_destiny) {
    
        //Primera parte: REALIZAR RETIRO
        realizarRetiro(gestor, manejadorCliente, manejadorCuenta, account_origen);
        
        // Verificar si la cuenta_destino es en la misma moneda de la origen,
        // de lo contrario, hacer el cambio de moneda
        
        
        
        // Segunda parte: REALIZAR DEPOSITO
        realizarDeposito(gestor, manejadorCliente, manejadorCuenta, account_destiny);
    
    
    }
    
        private void updateBalance(double monto, String numeroCuenta) {
        
        for (Cuenta miCuenta: arregloDeCuentas) {
            if (numeroCuenta.equals(miCuenta.getNumeroCuenta())) {
            miCuenta.setSaldoActual(miCuenta.getSaldoActual() + monto);
        } 
        }
        
    }
    
    */
    
    

}
