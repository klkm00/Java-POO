/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duocvina.sistema.prestamolibros;

/**
 *
 * @author User
 */
public class Libro {
    
    private String isbnLibro;
    private String tituloLibro;
    private String usuarioSolicitante;
    private String bibliotecarioEncargado;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Libro(String isbnLibro, String tituloLibro, String usuarioSolicitante, String bibliotecarioEncargado, String fechaPrestamo, String fechaDevolucion) {
        this.isbnLibro = isbnLibro;
        this.tituloLibro = tituloLibro;
        this.usuarioSolicitante = usuarioSolicitante;
        this.bibliotecarioEncargado = bibliotecarioEncargado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }
    public String getTituloLibro() {
        return tituloLibro;
    }
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
    public String getUsuarioSolicitante() {
        return usuarioSolicitante;
    }
    public void setUsuarioSolicitante(String usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }
    public String getBibliotecarioEncargado() {
        return bibliotecarioEncargado;
    }
    public void setBibliotecarioEncargado(String bibliotecarioEncargado) {
        this.bibliotecarioEncargado = bibliotecarioEncargado;
    }
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
