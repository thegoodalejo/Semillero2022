/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TorresHanoi;

/**
 *
 * @author User
 */
public class TorresHanoi {
    public static void main(String[] args) {
        moverTorre(4,"A","B","C");
    }
    public static void moverTorre(int numeroDiscos,String origen, String destino, String intermedio){
        if (numeroDiscos >= 1){
            moverTorre(numeroDiscos-1,origen,intermedio,destino);
            moverDisco(origen,destino);
            moverTorre(numeroDiscos-1,intermedio,destino,origen);
        }
    }

    public static void moverDisco(String desde,String hacia){
        System.out.println("Movemos el disco desde el Origen " +desde+ " hacia el Destino "+hacia);
    }

    
    
}
