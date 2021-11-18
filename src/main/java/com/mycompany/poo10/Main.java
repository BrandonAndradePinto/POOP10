package com.mycompany.poo10;
/**
 *
 * @author brandon
 */
public class Main {
    public static void main(String[] args) throws LimiteExcedidoException, SaldoInsuficienteException, NumeroDeRetirosExcedidoException {
        System.out.println("---------------[ Exceptiones en Arreglos]---------------");
        try{
            String mensajes[] = {"Mensaje uno", "Mensaje dos", "Mensaje tres"};
            for(int i = 0; i <= 3; i++){
            System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: Apuntador duera de renago en el arreglo");
            System.out.println(e);
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        
        System.out.println("\n---------------[ Exceptiones en Aritmetica]---------------");
        try{
            Integer denomindador = null;
            float equis = 5/denomindador;
            System.out.println(equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("ERROR:" + e.getMessage());
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println("ERROR:" + e.getMessage());
        }catch(Exception e){
            System.out.println("ERROR GENERAL: "+ e.getMessage());
        }
        
        System.out.println("\n---------------[ Propagacion de Exceptiones ]---------------");
        try{
            int division = division (10,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("OCURRIO UN ERROR: " + e.getMessage());
        }
        
        System.out.println("\n---------------[ Propagacion de Exceptiones 2 ]---------------");
        int divicion2 = division2(4, 0);
        System.out.println(divicion2);
        
        System.out.println("\n-----------------------[ throw - throws ]----------------------");
        try{
            int div3 = div3(6,0);
            System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        
        System.out.println("\n-----------------[ Crea nuevas Exceptiones ]------------------");
        try{
            Cuenta miCuenta = new Cuenta();
            miCuenta.depositar(2000);
            miCuenta.consultarSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultarSaldo();
            miCuenta.retirar(650);
            miCuenta.consultarSaldo();
        }catch(SaldoInsuficienteException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        
        System.out.println("\n---------------------------[ Actividad Extra ]----------------------------");
        System.out.println("\n-----------------[ No se puede ingresar mas de $20,000 ]------------------");
        try{
            Cuenta miCuenta = new Cuenta();
            miCuenta.depositar(5_500);
            miCuenta.consultarSaldo();
            miCuenta.retirar(1200);
            miCuenta.consultarSaldo();
            miCuenta.depositar(20_100);
            miCuenta.consultarSaldo();
        }catch(LimiteExcedidoException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        
        System.out.println("\n-----------------[ Solo se pueden realizar maximo 3 retiros ]------------------");
        try{
            Cuenta miCuenta = new Cuenta();
            miCuenta.depositar(17_500);
            miCuenta.consultarSaldo();
            miCuenta.retirar(5_00);
            miCuenta.retirar(5_600);
            miCuenta.retirar(500);
            miCuenta.consultarSaldo();
            miCuenta.retirar(7_000);
        }catch(NumeroDeRetirosExcedidoException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }

    private static int division(int a, int b) {
        return a/b;
    }
    
    private static int division2(int a, int b) { // Cachar exception dentro de Metodos No recomendable
        int c = 0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        return c;
    }

    private static int div3(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Division entre cero, no lo vuelvas a hacer");
        }
        int c = a/b;
        return c;
    }
    //80
}
