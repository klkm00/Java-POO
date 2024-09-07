/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemacomisaria;

/**
 *
 * @author User
 */
public class SistemaComisaria {

    public static void main(String[] args) {
        
        Celda celda01 = new Celda (1, 10);
        Detenido detenido01 = new Detenido ("Sophie", "21.101.913-1");
        Comisaria comisaria01 = new Comisaria ("Comisaria Equis", 01, "Vina del Mar");
        
        comisaria01.registrarDetenido(detenido01, celda01);
        
                
        
       
    }
}
