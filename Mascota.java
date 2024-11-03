/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaairbnbpets;

/**
 *
 * @author User
 */
public abstract class Mascota {
    
    protected String codigo;
    protected String nombre;
    protected double peso;
    protected int edad;
    protected int diasAlojamiento;
    protected boolean supervision;
    
    public Mascota() { }

    public Mascota(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervision) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.supervision = supervision;
    }
    
    
    public abstract void mostrarDatos();
    
    public boolean cuidadoEspecial () {
        if(this.edad < 1 || this.edad > 8) {
            return true;
        } else {
            return false;
        }
    }
}
    




