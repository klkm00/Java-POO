/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duocvina.sistemacentromedico;

/**
 *
 * @author User
 */
public class SistemaCentroMedico {

    public static void main(String[] args) {
       
        Alumno alumno01 = new Alumno ("Sophie", "21.101.913-1", true, "DuocUC");
        Instituto instituto01 = new Instituto (001, "Vina del Mar");
        CentroMedico centro01 = new CentroMedico ("Vina del Mar");
        
        String repNombreCasaEstudios = alumno01.getInstitutoAlumno();
        String repSedeCasaEstudios = instituto01.getSedeInstituto();
        String repRutSolicitante = alumno01.getRutAlumno();
        String repJornadaSolicitante = alumno01.getJourney();
        
        Reporte reporte01= new Reporte (repNombreCasaEstudios, repSedeCasaEstudios, repRutSolicitante, repJornadaSolicitante, 5000);
        
        centro01.registrarConsulta(alumno01);
    }
}
