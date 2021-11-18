package com.mycompany.poo10;
/**
 *
 * @author brandon
 */
public class Cuenta {
    private double saldo;
    private int numRetiros;

    public Cuenta() {
        saldo = 0;
        numRetiros = 0;
    }
    
    public void depositar(double monto) throws LimiteExcedidoException{
        System.out.println("Depositando " + monto);
        if(monto > 20_000){
            throw new LimiteExcedidoException();
        }
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, NumeroDeRetirosExcedidoException{
        System.out.println("Retirando " + monto);
        if(saldo < monto){
            throw new SaldoInsuficienteException();
        }
        if(numRetiros == 3){
            throw new NumeroDeRetirosExcedidoException();
        }
        saldo-=monto;
        System.out.println("Retiro Exitoso ;)\n");
        numRetiros++;
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo disponible = " + saldo);
    }
    
}
