/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistema.prestamolibros;

/**
 *
 * @author User
 */

//Contexto: Una biblioteca pública busca digitalizar su sistema de préstamos de libros para poder llevar 
//un registro de los libros prestados a los usuarios y las devoluciones realizadas. Te han contratado para 
//desarrollar un sistema que permita almacenar la información de los usuarios, los empleados y los libros 
//prestados, y calcular la cantidad total de libros que ha pedido prestado un usuario.
//Requerimiento Inicial: El sistema deberá registrar la información esencial de cada usuario, 
//como su ID, nombre completo, dirección y número de teléfono. De cada empleado de la biblioteca, considerar 
//el ID de empleado, su nombre completo, fecha de contratación y el departamento en el que trabaja (se asume 
//que cada empleado solo pertenece a un departamento). En cuanto a los libros prestados, se debe almacenar el 
//ISBN único del libro, el título del libro, el nombre del usuario que lo ha solicitado y el empleado que 
//gestionó el préstamo, además de las fechas de préstamo y devolución.


public class SistemaPrestamoLibros {

    public static void main(String[] args) {
        
        Usuario user01 = new Usuario ("USER01", "Sophie", "Calle falsa 0000", 961063686);
        Bibliotecario bibliotecario01 = new Bibliotecario ("BIBL01", "Srta. Bibliotecaria", "03/05/2024", "Fantasia Epica");
        
        String nombreUsuarioSolicitante = user01.getNombreUsuario();
        String nombreBibliotecarioEncargado = bibliotecario01.getNombreBibliotecario();
        
        Libro libro01 = new Libro ("FE0001", "El nombre del viento.", nombreUsuarioSolicitante, nombreBibliotecarioEncargado, "07/09/2024", "21/09/2024");
        
        String tituloLibro = libro01.getTituloLibro();
        
        bibliotecario01.prestarLibro(tituloLibro, nombreUsuarioSolicitante, nombreBibliotecarioEncargado);
                
       
        
    }
}
