/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaairbnbpets;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AirbnbPets {
    
    private ArrayList<Mascota> mascotas;

    public AirbnbPets() { 
        this.mascotas = new ArrayList<>();
    }
    
    public void registrarMascota(Mascota mascotaNueva) {
        for(Mascota mascotaRegistrada : mascotas) {
            if (mascotaRegistrada.codigo.equals(mascotaNueva.codigo)) {
                System.out.println("La mascota de codigo: "+mascotaNueva.codigo+"no se puede registrar.");
                return;
            }   
        }
        if (mascotas.add(mascotaNueva)){
                System.out.println("Se ha registrado exitosamente a: "+mascotaNueva.nombre);
        } else {
                System.out.println("No se ha regitrado alguna mascota.");
        }   
    }
    
    public void listarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            System.out.println("-----");
            System.out.println("Registro de mascotas.");
            System.out.println("-----");
            for (Mascota mascotaRegistrada : mascotas ) {
                mascotaRegistrada.mostrarDatos();
                System.out.println("-----");
            }
        }
    }
    
    public int contarMascotas() {
        return mascotas.size();
    }
 
}
