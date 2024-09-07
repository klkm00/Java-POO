/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistema.prestamolibros;

/**
 *
 * @author User
 */
public class Bibliotecario {
    
    private String idBibliotecario;
    private String nombreBibliotecario;
    private String fechaContratacion;
    private String departamentoBibliotecario;

    public Bibliotecario(String idBibliotecario, String nombreBibliotecario, String fechaContratacion, String departamentoBibliotecario) {
        this.idBibliotecario = idBibliotecario;
        this.nombreBibliotecario = nombreBibliotecario;
        this.fechaContratacion = fechaContratacion;
        this.departamentoBibliotecario = departamentoBibliotecario;
    }

    public String getIdBibliotecario() {
        return idBibliotecario;
    }
    public void setIdBibliotecario(String idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    public String getNombreBibliotecario() {
        return nombreBibliotecario;
    }
    public void setNombreBibliotecario(String nombreBibliotecario) {
        this.nombreBibliotecario = nombreBibliotecario;
    }
    public String getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getDepartamentoBibliotecario() {
        return departamentoBibliotecario;
    }
    public void setDepartamentoBibliotecario(String departamentoBibliotecario) {
        this.departamentoBibliotecario = departamentoBibliotecario;
    }
    
    public void prestarLibro(String tituloLibro, String nombreUsuario, String nombreBibliotecario) {
        System.out.println("BIBLIOTECA");
        System.out.println("Libro Solicitado: "+tituloLibro);
        System.out.println("Solicitante: "+nombreUsuario);
        System.out.println("Bibliotecario/a; "+nombreBibliotecario);
    }
   
    
}
