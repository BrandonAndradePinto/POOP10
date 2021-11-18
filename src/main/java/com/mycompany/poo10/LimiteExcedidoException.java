package com.mycompany.poo10;
/**
 *
 * @author brandon
 */
public class LimiteExcedidoException extends Exception {

    public LimiteExcedidoException() {
        super("No se puede depositar montos superiores a $20,000");
    }
    
}
