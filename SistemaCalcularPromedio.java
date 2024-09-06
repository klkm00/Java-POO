/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemacalcularpromedio;

/**
 *
 * @author klkm0
 */
public class SistemaCalcularPromedio {

    public static void main(String[] args) {
        Alumno alumnoEvaluado = new Alumno ("Sophie", "21.101.913-1", 21, "15/12/2002");
        Docente docenteEncargado = new Docente ("Profesor Equis", "00.000.000-k", 0001, "01/01/2024", "Sede Viña del Mar");
        
        String nombreAlumnoEvaluado = alumnoEvaluado.getNombreAlumno();
        String nombreDocenteEncargado = docenteEncargado.getNombreDocente();
        
        Asignatura asignatura01 = new Asignatura("Programacion", "POO010", nombreDocenteEncargado, nombreAlumnoEvaluado, 70, 65, 60);
        
        int nota1 = asignatura01.getNota1();
        int nota2 = asignatura01.getNota2();
        int nota3 = asignatura01.getNota3();
        
        int promedioFinal = docenteEncargado.calcularPromedio(nota1, nota2, nota3);
        
        System.out.println("El promedio final de notas es: "+promedioFinal);
        
        
    }
}
