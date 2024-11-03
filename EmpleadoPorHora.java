/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemagestionempleados;

/**
 *
 * @author User
 */
public class EmpleadoPorHora extends Empleado implements BonusCalculable{
    
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String rut, String nombre, double valorHora, int horasTrabajadas) {
        super(nombre, rut);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
        double totalTrabajado = this.valorHora*this.horasTrabajadas;
        return totalTrabajado + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        double totalTrabajado = this.valorHora*this.horasTrabajadas;
        return totalTrabajado*0.05;
    }  
}
