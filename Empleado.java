/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaventaneumaticos;

/**
 *
 * @author vina
 */
public class Empleado {
    private String rutEmpleado;
    private int numeroEmpleado;
    private String nombreEmpleado;
    private String sucursalEmpleado;

    public Empleado(String rutEmpleado, int numeroEmpleado, String nombreEmpleado, String sucursalEmpleado) {
        this.rutEmpleado = rutEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.sucursalEmpleado = sucursalEmpleado;
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }
    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getSucursalEmpleado() {
        return sucursalEmpleado;
    }
    public void setSucursalEmpleado(String sucursalEmpleado) {
        this.sucursalEmpleado = sucursalEmpleado;
    }
    
    public int valorTotalVenta(int precioNeumatico, int cantidadVenta) {
        int sumaProductos = precioNeumatico*cantidadVenta;
        return sumaProductos;
    }
    
}
