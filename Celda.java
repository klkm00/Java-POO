/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacomisaria;

/**
 *
 * @author User
 */
public class Celda {
    
    private int numeroCelda;
    private int disponibilidadCelda;

    public Celda(int numeroCelda, int disponibilidadCelda) {
        this.numeroCelda = numeroCelda;
        this.disponibilidadCelda = disponibilidadCelda;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }
    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }
    public int getDisponibilidadCelda() {
        return disponibilidadCelda;
    }
    public void setDisponibilidadCelda(int disponibilidadCelda) {
        this.disponibilidadCelda = disponibilidadCelda;
    }
    
    
    
}
