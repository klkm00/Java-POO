/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacentromedico;

/**
 *
 * @author User
 */
public class CentroMedico {
    
    private String localidadCentro;

    public CentroMedico(String localidadCentro) {
        this.localidadCentro = localidadCentro;
    }

    public String getLocalidadCentro() {
        return localidadCentro;
    }
    public void setLocalidadCentro(String localidadCentro) {
        this.localidadCentro = localidadCentro;
    }
    
    
    public void registrarConsulta(Alumno alumno) {
        System.out.println("REGISTROS");
        System.out.println("Nombre Solicitante: "+alumno.getNombreAlumno());
        System.out.println("Rut Solicitante: "+alumno.getRutAlumno());
        System.out.println("Instituto del Solicitante: "+alumno.getInstitutoAlumno());  
    }
    
    public void imprimirReporte() {
    }
}
