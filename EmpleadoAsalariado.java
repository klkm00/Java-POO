/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemagestionempleados;

/**
 *
 * @author User
 */
public class EmpleadoAsalariado extends Empleado implements BonusCalculable{
    
    private double sueldoBase;

    public EmpleadoAsalariado(String rut, String nombre, double sueldoBase) {
        super(nombre, rut);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
    @Override
    public double calcularSalario() {
        return this.sueldoBase+calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return this.sueldoBase*0.10;
    }
    
}
