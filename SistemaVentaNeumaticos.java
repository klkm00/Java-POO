/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemaventaneumaticos;

/**
 *
 * @author vina
 */
public class SistemaVentaNeumaticos {

    public static void main(String[] args) {
        
        Cliente cliente01 = new Cliente ("18962745-k", "Sr Cliente", 26, "Calle falsa 1111");
        Empleado empleado01 = new Empleado ("12682345-2", 001, "Sr Empleado", "Sucursal Vina del Mar");
        Producto neumatico01 = new Producto ("SR6956", "Neumatico para moto X", 25000, 2);
        Venta venta01 = new Venta ();
        
        venta01.regitroVenta(cliente01, empleado01, neumatico01);
    }
}
