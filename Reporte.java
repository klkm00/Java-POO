/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacentromedico;

/**
 *
 * @author User
 */
public class Reporte {
    
    private String nombreCasaEstudios;
    private String sedeCasaEstudios;
    private String rutSolicitante;
    private String jornadaSolicitante;
    private int valorConsulta;

    public Reporte(String nombreCasaEstudios, String sedeCasaEstudios, String rutSolicitante, String jornadaSolicitante, int valorConsulta) {
        this.nombreCasaEstudios = nombreCasaEstudios;
        this.sedeCasaEstudios = sedeCasaEstudios;
        this.rutSolicitante = rutSolicitante;
        this.jornadaSolicitante = jornadaSolicitante;
        this.valorConsulta = valorConsulta;
    }

    public String getNombreInstituto() {
        return nombreCasaEstudios;
    }
    public void setNombreInstituto(String nombreInstituto) {
        this.nombreCasaEstudios = nombreInstituto;
    }
    public String getSedeInstituto() {
        return sedeCasaEstudios;
    }
    public void setSedeInstituto(String sedeInstituto) {
        this.sedeCasaEstudios = sedeInstituto;
    }
    public String getRutSolicitante() {
        return rutSolicitante;
    }
    public void setRutSolicitante(String rutSolicitante) {
        this.rutSolicitante = rutSolicitante;
    }
    public String getJornadaSolicitante() {
        return jornadaSolicitante;
    }
    public void setJornadaSolicitante(String jornadaSolicitante) {
        this.jornadaSolicitante = jornadaSolicitante;
    }
    public int getValorConsulta() {
        return valorConsulta;
    }
    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    
    
    
}
