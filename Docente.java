/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacalcularpromedio;

/**
 *
 * @author klkm0
 */
public class Docente {
    
    private String nombreDocente;
    private String rutDocente;
    private int numeroDocente;
    private String fechaIngreso;
    private String sede;

    public Docente(String nombreDocente, String rutDocente, int numeroDocente, String fechaIngreso, String sede) {
        this.nombreDocente = nombreDocente;
        this.rutDocente = rutDocente;
        this.numeroDocente = numeroDocente;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }
    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }
    public String getRutDocente() {
        return rutDocente;
    }
    public void setRutDocente(String rutDocente) {
        this.rutDocente = rutDocente;
    }
    public int getNumeroDocente() {
        return numeroDocente;
    }
    public void setNumeroDocente(int numeroDocente) {
        this.numeroDocente = numeroDocente;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    
    
    public int calcularPromedio(int nota1, int nota2, int nota3) {
        int suma = nota1 + nota2 + nota3;
        int promedio = suma/3;
        return promedio;
    }
    
    
    
}
