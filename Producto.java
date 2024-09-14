/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaventaneumaticos;

/**
 *
 * @author vina
 */
public class Producto {
    
    private String codigoNeumatico;
    private String modeloNeumatico;
    private int precioNeumatico;
    private int cantidadVenta;

    public Producto(String codigoNeumatico, String modeloNeumatico, int precioNeumatico, int cantidadVenta) {
        this.codigoNeumatico = codigoNeumatico;
        this.modeloNeumatico = modeloNeumatico;
        this.precioNeumatico = precioNeumatico;
        this.cantidadVenta = cantidadVenta;
    }

    public String getCodigoNeumatico() {
        return codigoNeumatico;
    }
    public void setCodigoNeumatico(String codigoNeumatico) {
        this.codigoNeumatico = codigoNeumatico;
    }
    public String getModeloNeumatico() {
        return modeloNeumatico;
    }
    public void setModeloNeumatico(String modeloNeumatico) {
        this.modeloNeumatico = modeloNeumatico;
    }
    public int getPrecioNeumatico() {
        return precioNeumatico;
    }
    public void setPrecioNeumatico(int precioNeumatico) {
        this.precioNeumatico = precioNeumatico;
    }
    public int getCantidadVenta() {
        return cantidadVenta;
    }
    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }
    
    
}
