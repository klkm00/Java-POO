/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaventaneumaticos;

/**
 *
 * @author vina
 */
public class Venta {
    
    
    public void regitroVenta(Cliente cliente, Empleado empleado, Producto producto) {
        
        System.out.println("----------------------");
        System.out.println("VENTA");
        System.out.println("Datos del cliente ");
        System.out.println("Nombre: "+cliente.getNombreCliente());
        System.out.println("Rut: "+cliente.getRutCliente());
        System.out.println("Direccion: "+cliente.getDireccionCliente());
        System.out.println("Datos del Empleado");
        System.out.println("Nombre: "+empleado.getNombreEmpleado());
        System.out.println("Rut: "+empleado.getRutEmpleado());
        System.out.println("Sucursal: "+empleado.getSucursalEmpleado());
        System.out.println("Datos de la venta");
        System.out.println("Productos: "+producto.getModeloNeumatico());
        System.out.println("Codigo productos: "+producto.getCodigoNeumatico());
        System.out.println("Cantidad: "+producto.getCantidadVenta());
        System.out.println("Valor unitario: $"+producto.getPrecioNeumatico());
        System.out.println("Valor total: $"+empleado.valorTotalVenta(25000, 2));
        System.out.println("----------------------");
        
    }
    
}
