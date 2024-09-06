/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacalcularpromedio;

/**
 *
 * @author klkm0
 */
public class Alumno {
    
    private String nombreAlumno;
    private String rutAlumno;
    private int edad;
    private String fechaNacimiento;

    public Alumno(String nombreAlumno, String rutAlumno, int edad, String fechaNacimiento) {
        this.nombreAlumno = nombreAlumno;
        this.rutAlumno = rutAlumno;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    
    
}
