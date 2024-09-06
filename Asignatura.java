/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacalcularpromedio;

/**
 *
 * @author klkm0
 */
public class Asignatura {
    
    private String nombreAsignatura;
    private String codigoAsignatura;
    private String docenteEncargado;
    private String alumnoEvaluado;
    private int nota1;
    private int nota2;
    private int nota3;

    public Asignatura(String nombreAsignatura, String codigoAsignatura, String docenteEncargado, String alumnoEvaluado, int nota1, int nota2, int nota3) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.docenteEncargado = docenteEncargado;
        this.alumnoEvaluado = alumnoEvaluado;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }
    public String getDocenteEncargado() {
        return docenteEncargado;
    }
    public void setDocenteEncargado(String docenteEncargado) {
        this.docenteEncargado = docenteEncargado;
    }
    public String getAlumnoEvaluado() {
        return alumnoEvaluado;
    }
    public void setAlumnoEvaluado(String alumnoEvaluado) {
        this.alumnoEvaluado = alumnoEvaluado;
    }
    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    
    
}
