package com.mycompany.poo10;
/**
 *
 * @author brandon
 */
public class NumeroDeRetirosExcedidoException extends Exception {

    public NumeroDeRetirosExcedidoException() {
        super("Numero de retiros excedido (Solo se pueden realizar 3 retiros)");
    }
    
}
