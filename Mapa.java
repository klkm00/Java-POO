/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.sistemavideojuego;
import  java.util.ArrayList;
/**
 *
 * @author vina
 */
public class Mapa {
    private ArrayList<Personaje> personajes;
    
    public Mapa () {
        this.personajes = new ArrayList<>();
    }
    
    public void agregarPersonaje(Personaje nuevoPersonaje) {
        if (personajes.add(nuevoPersonaje)) {
            System.out.println("Nuevo personaje agrgado con éxito.");
        } else {
            System.out.println("No se ha podido agregar el personaje.");
        }
    }
    
    public void buscarPersonaje(Personaje nuevoPersonaje) {
        for (Personaje personajeListado : personajes) {
            if (nuevoPersonaje.correoJugador.equals(personajeListado.correoJugador)) {
                System.out.println("Hay un personaje con un correo ya registrado");
                return;
            }
        }
    }
    
    public void listarPersonajes() {
        for (Personaje personaje : personajes) {
            personaje.mostrarInformacion();
            System.out.println("-----");
        }
    }
}
