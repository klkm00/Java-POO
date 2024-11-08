/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.sistemavideojuego;

/**
 *
 * @author vina
 */
public class Arquero extends Personaje implements Jugable {
    private int cantidadFlechas;

    public Arquero(String id, String nombre, String correoJugador, double ataque, int resistencia, int cantidadFlechas) {
        super(id, nombre, correoJugador, ataque, resistencia);
        this.cantidadFlechas = cantidadFlechas;
    }

    public int getCantidadFlechas() {
        return cantidadFlechas;
    }
    public void setCantidadFlechas(int cantidadFlechas) {
        this.cantidadFlechas = cantidadFlechas;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoJugador() {
        return correoJugador;
    }
    public void setCorreoJugador(String correoJugador) {
        this.correoJugador = correoJugador;
    }
    public double getAtaque() {
        return ataque;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public double calcularAtaqueFinal() {
        double ataqueSumable = this.ataque*0.08;
        double ataqueFinal = this.ataque + ataqueSumable;
        return ataqueFinal;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Personaje de tipo Arquero");
        System.out.println("ID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Correo vinculado: "+this.correoJugador);
        System.out.println("Ataque: "+this.ataque);
        System.out.println("Ataque con bonificacion: "+calcularAtaqueFinal());
        System.out.println("Resistencia: "+this.resistencia);
        System.out.println("Cantidad de flechas: "+this.cantidadFlechas);
        System.out.println("Puntos de personaje: "+calcularPuntosPersonajes());
    }

    @Override
    public double calcularPuntosPersonajes() {
        double puntosFinales = experienciaBase + this.ataque + this.resistencia;
        return puntosFinales;
    }
}
