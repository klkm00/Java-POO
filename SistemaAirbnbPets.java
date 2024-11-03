/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemaairbnbpets;

/**
 *
 * @author User
 */
public class SistemaAirbnbPets {

    public static void main(String[] args) {
        
        AirbnbPets airbnbpets = new AirbnbPets ();
        
        Perro perro01 = new Perro ("#P01", "Sylus", 32.1, 4, 8, true, true);
        Perro perro02 = new Perro ("#P02", "Kitkat", 25.2, 2, 5, false, true);
        airbnbpets.registrarMascota(perro01);
        airbnbpets.registrarMascota(perro02);
        
        Gato gato01 = new Gato ("#G01", "Zayne", 4.6, 3, 2, false, "Siberiano");
        Gato gato02 = new Gato ("#G02", "Trufa", 3.4, 2, 3, true, "Siames");
        airbnbpets.registrarMascota(gato01);
        airbnbpets.registrarMascota(gato02);
        
        Conejo conejo01 = new Conejo ("#C01", "Pompon", 1.8, 6, 3, true, "Heno y verduras");
        airbnbpets.registrarMascota(conejo01);
        
        if(conejo01.cuidadoEspecail()) {
            System.out.println("-----");
            System.out.println("El conejo "+conejo01.getNombre()+" necesita cuidados especiales.");
        }
        
        airbnbpets.listarMascotas();
        System.out.println("Cantidad de mascotas alojadas: "+airbnbpets.contarMascotas());
    }
}
