/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistemaairbnbpets;

/**
 *
 * @author User
 */
public class Gato extends Mascota implements CuidadoEspecial {
    
    private String pedigree;
    
    public Gato() {}

    public Gato(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervision, String pedigree) {
        super(codigo, nombre, peso, edad, diasAlojamiento, supervision);
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }
    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }
    public boolean isSupervision() {
        return supervision;
    }
    public void setSupervision(boolean supervision) {
        this.supervision = supervision;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Peso: "+this.peso);
        System.out.println("Edad: "+this.edad);
        System.out.println("Dias de Alojamiento: "+this.diasAlojamiento);
        if (this.supervision) {
            System.out.println("Requiere supervision");
        } else {
            System.out.println("No requiere supervision");
        }
        System.out.println("Pedigree: "+this.pedigree);
    }

    @Override
    public boolean cuidadoEspecail() {
        if(this.edad < 1 || this.edad > 8) {
            return true;
        } else {
            return false;
        }
    }
}
