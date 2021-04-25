/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bitxanax
 */
public class Institucion {
    private String nombre;
    private String tipoInsitucion;
    private int cantidadAlumnos;
    private int cantidadDocentes;
    private int cantidadSedes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInsitucion() {
        return tipoInsitucion;
    }

    public void setTipoInsitucion(String tipoInsitucion) {
        this.tipoInsitucion = tipoInsitucion;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public int getCantidadDocentes() {
        return cantidadDocentes;
    }

    public void setCantidadDocentes(int cantidadDocentes) {
        this.cantidadDocentes = cantidadDocentes;
    }

    public int getCantidadSedes() {
        return cantidadSedes;
    }

    public void setCantidadSedes(int cantidadSedes) {
        this.cantidadSedes = cantidadSedes;
    }
}
