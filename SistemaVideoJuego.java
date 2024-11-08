/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.sistemavideojuego;

/**
 *
 * @author vina
 */
public class SistemaVideoJuego {

    public static void main(String[] args) {
        
        Mapa mapa = new Mapa ();
        
        Guerrero guerrero01 = new Guerrero ("#G01", "Aatrox", "jugadoraatrox@gmail.com", 120, 60, 3);
        Guerrero guerrero02 = new Guerrero ("#G02", "Irelia", "jugadorirelia@gmail.com", 100, 75, 1);
        
        Mago mago01 = new Mago ("#M01", "Soraka", "jugadorsoraka@gmail.com", 80, 50, true);
        Mago mago02 = new Mago ("#M02", "Syndra", "jugadoraatrox@gmail.com", 140, 50, false);
        
        Arquero arquero01 = new Arquero ("#A01", "Ashe", "jugadorashe@gmail.com", 180, 30, 25);
        Arquero arquero02 = new Arquero ("#A02", "Vayne", "jugadorvayne@gmail.com", 165, 35, 40);
        
        mapa.agregarPersonaje(guerrero01);
        mapa.agregarPersonaje(guerrero02);
        mapa.agregarPersonaje(mago01);
        mapa.agregarPersonaje(mago02);
        mapa.agregarPersonaje(arquero01);
        mapa.agregarPersonaje(arquero02);
        
        mapa.listarPersonajes();
        
        mapa.buscarPersonaje(mago02);
        System.out.println("El personaje de correo "+mago02.correoJugador+" ya está registrado.");
        System.out.println("Personajes encontrados:");
        System.out.println(guerrero01.nombre);
        System.out.println(mago02.nombre);
    }
}
