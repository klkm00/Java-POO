/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemacentromedico;

/**
 *
 * @author User
 */
public class Instituto {
    
    
    private int numeroInstituto;
    private String sedeInstituto;

    public Instituto(int numeroInstituto, String sedeInstituto) {
        
        this.numeroInstituto = numeroInstituto;
        this.sedeInstituto = sedeInstituto;
    }

    public int getNumeroInstituto() {
        return numeroInstituto;
    }
    public void setNumeroInstituto(int numeroInstituto) {
        this.numeroInstituto = numeroInstituto;
    }
    public String getSedeInstituto() {
        return sedeInstituto;
    }
    public void setSedeInstituto(String sedeInstituto) {
        this.sedeInstituto = sedeInstituto;
    }
    
    
    
    
}
