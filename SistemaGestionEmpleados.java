/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemagestionempleados;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Departamento departamento = new Departamento("D001", "Recursos Humanos");
        int opcion;
      
        do {
            System.out.println("-----------------");
            System.out.println("Menu de opciones");
            System.out.println("-----------------");
            System.out.println("1. Agregar empleado asalariado.");
            System.out.println("2. Agregar empleado por hora.");
            System.out.println("3. Calcular costo total de sueldos.");
            System.out.println("4. Salir");
            System.out.println("Ir a: ");
            opcion = scanner.nextInt();
                    
            switch(opcion) {
                
                case 1: 
                    System.out.println("Registro de empleado asalariado");
                    System.out.println("Rut del empleado: ");
                    String rutAsalariado = scanner.nextLine();
                    System.out.println("Nombre del empleado: ");
                    String nombreAsalariado = scanner.nextLine();
                    System.out.println("Sueldo base de este empleado: ");
                    double sueldoBase = scanner.nextDouble();
                    
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(rutAsalariado, nombreAsalariado, sueldoBase);
                    departamento.agregarEmpleado(empleadoAsalariado);
                    System.out.println("Empleado asalariado agregado con exito.");
                    break;
                    
                case 2: 
                    System.out.println("Registro empleado por hora");
                    System.out.println("Rut empleado: ");
                    String rutPorHora = scanner.nextLine();
                    System.out.println("Nombre del empleado: ");
                    String nombrePorHora = scanner.nextLine();
                    System.out.println("Valor por hora: ");
                    double valorHora = scanner.nextDouble();
                    System.out.println("Horas de trabajo: ");
                    int horasTrabajadas = scanner.nextInt();
                    
                    EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(rutPorHora, nombrePorHora, valorHora, horasTrabajadas);
                    departamento.agregarEmpleado(empleadoPorHora);
                    System.out.println("Empleado por hora agregado con axito.");
                    break;
                    
                case 3:
                    double costoTotal = departamento.calcularTotalSalarios();
                    System.out.println("Costo toal de sueldos: "+costoTotal);
                    break;
                    
                case 4:  
                    System.out.println("Saliendo del sistema.");
                    break;
                    
                default: 
                    System.out.println("Opcion no valida, intente nuevamente.");  
                    break;
            }
            
        } while (opcion !=4);
        
        scanner.close();
    }
}
