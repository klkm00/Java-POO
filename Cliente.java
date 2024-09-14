/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaventaneumaticos;

/**
 *
 * @author vina
 */
public class Cliente {
    
    private String rutCliente;
    private String nombreCliente;
    private int edadCliente;
    private String direccionCliente;

    public Cliente(String rutCliente, String nombreCliente, int edadCliente, String direccionCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.direccionCliente = direccionCliente;
    }
    
    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getEdadCliente() {
        return edadCliente;
    }
    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }
    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    
}
