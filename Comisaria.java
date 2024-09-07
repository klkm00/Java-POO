/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacomisaria;

/**
 *
 * @author User
 */
public class Comisaria {
    
    private String nombreComisaria;
    private int numeroComisaria;
    private String localidadComisaria;

    public Comisaria(String nombreComisaria, int numeroComisaria, String localidadComisaria) {
        this.nombreComisaria = nombreComisaria;
        this.numeroComisaria = numeroComisaria;
        this.localidadComisaria = localidadComisaria;
    }

    public String getNombreComisaria() {
        return nombreComisaria;
    }
    public void setNombreComisaria(String nombreComisaria) {
        this.nombreComisaria = nombreComisaria;
    }
    public int getNumeroComisaria() {
        return numeroComisaria;
    }
    public void setNumeroComisaria(int numeroComisaria) {
        this.numeroComisaria = numeroComisaria;
    }
    public String getLocalidadComisaria() {
        return localidadComisaria;
    }
    public void setLocalidadComisaria(String localidadComisaria) {
        this.localidadComisaria = localidadComisaria;
    }
    
    public void registrarDetenido(Detenido detenido, Celda celda){
        System.out.println("REGISTRO COMISARIA");
        System.out.println("Detenido: "+detenido.getNombreDetenido());
        System.out.println("Celda de ingreso: "+celda.getNumeroCelda());
        
        int disponibilidadAnterior = celda.getDisponibilidadCelda();
        int disponibilidadActualizada = disponibilidadAnterior-1;
        celda.setDisponibilidadCelda(disponibilidadActualizada);
        
        System.out.println("Celdas disponibles: "+celda.getDisponibilidadCelda());
        
        
        
        
    }
    
            
}
