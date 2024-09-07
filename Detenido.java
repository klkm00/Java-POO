/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacomisaria;

/**
 *
 * @author User
 */
public class Detenido {
    
    private String nombreDetenido;
    private String rutDetenido;

    public Detenido(String nombreDetenido, String rutDetenido) {
        this.nombreDetenido = nombreDetenido;
        this.rutDetenido = rutDetenido;
    }

    public String getNombreDetenido() {
        return nombreDetenido;
    }
    public void setNombreDetenido(String nombreDetenido) {
        this.nombreDetenido = nombreDetenido;
    }
    public String getRutDetenido() {
        return rutDetenido;
    }
    public void setRutDetenido(String rutDetenido) {
        this.rutDetenido = rutDetenido;
    }
    
    
    
}
