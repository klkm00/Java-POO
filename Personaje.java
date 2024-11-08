/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.sistemavideojuego;

/**
 *
 * @author vina
 */
public abstract class Personaje {
    protected String id;
    protected String nombre;
    protected String correoJugador;
    protected double ataque;
    protected int resistencia;

    public Personaje() {
    }

    public Personaje(String id, String nombre, String correoJugador, double ataque, int resistencia) {
        this.id = id;
        this.nombre = nombre;
        this.correoJugador = correoJugador;
        this.ataque = ataque;
        this.resistencia = resistencia;
    }
    
    public abstract double calcularAtaqueFinal();
    public abstract void mostrarInformacion();
}
