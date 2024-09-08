/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacentromedico;

/**
 *
 * @author User
 */
public class Alumno {
    
    private String nombreAlumno;
    private String rutAlumno;
    private boolean jornadaAlumno; // True: vespertino, False: diurno
    private String institutoAlumno;

    public Alumno(String nombreAlumno, String rutAlumno, boolean jornadaAlumno, String institutoAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.rutAlumno = rutAlumno;
        this.jornadaAlumno = jornadaAlumno;
        this.institutoAlumno = institutoAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public String getRutAlumno() {
        return rutAlumno;
    }
    public void setRutAlumno(String rutAlumno) {
        this.rutAlumno = rutAlumno;
    }
    public boolean isJornadaAlumno() {
        return jornadaAlumno;
    }
    public void setJornadaAlumno(boolean jornadaAlumno) {
        this.jornadaAlumno = jornadaAlumno;
    }
    public String getInstitutoAlumno() {
        return institutoAlumno;
    }
    public void setInstitutoAlumno(String institutoAlumno) {
        this.institutoAlumno = institutoAlumno;
    }
    
    //Getter custom
    //Convierte a String los valores del boolean (T/F)
    public String getJourney() {
        if (this.jornadaAlumno==true) {
            return "Vespertino"; 
        } else {
            return "Diurno";
        }
    }
}
