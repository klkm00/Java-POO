/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.sistemavideojuego;

/**
 *
 * @author vina
 */
public class Mago extends Personaje implements Jugable {
    private boolean esCurador;

    public Mago(String id, String nombre, String correoJugador, double ataque, int resistencia, boolean esCurador) {
        super(id, nombre, correoJugador, ataque, resistencia);
        this.esCurador = esCurador;
    }

    public boolean isEsCurador() {
        return esCurador;
    }
    public void setEsCurador(boolean esCurador) {
        this.esCurador = esCurador;
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
        double ataqueSumable = this.ataque*0.1;
        double ataqueFinal = this.ataque + ataqueSumable;
        return ataqueFinal;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Personaje de tipo Mago");
        System.out.println("ID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Correo vinculado: "+this.correoJugador);
        System.out.println("Ataque: "+this.ataque);
        System.out.println("Ataque con bonificacion: "+calcularAtaqueFinal());
        System.out.println("Resistencia: "+this.resistencia);
        if (this.esCurador) {
            System.out.println("Curador: Si");
        } else {
            System.out.println("Curador: No");
        }
        System.out.println("Puntos de personaje: "+calcularPuntosPersonajes());
    }

    @Override
    public double calcularPuntosPersonajes() {
        double puntosFinales = experienciaBase + this.ataque + this.resistencia;
        return puntosFinales;
    }
}
