/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemagestionempleados;

/**
 *
 * @author User
 */
public abstract class Empleado {
    
    protected String rut;
    protected String nombre;

    public Empleado(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
    
}
