/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemagestionempleados;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Departamento {
    
    private String idDepartamento;
    private String nombreDepartamento;
    private ArrayList<Empleado> empleados;

    public Departamento(String idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        
        this.empleados = new ArrayList<>();
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        if (this.empleados.add(empleado)) {
            System.out.println("Empleado agregado con exito.");
        } else {
            System.out.println("No se agrego el empleado.");
        }
    }
        
    public double calcularTotalSalarios() {
        double totalSalarios = 0.0;
        for (Empleado empleado : empleados) {
            totalSalarios = totalSalarios+empleado.calcularSalario();
        }
        return totalSalarios;
    }
}
    

