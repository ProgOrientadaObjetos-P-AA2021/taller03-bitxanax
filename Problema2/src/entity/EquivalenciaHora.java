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
public class EquivalenciaHora {

    private double horas,
            minutos,
            segundos,
            dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public double getSegundos() {
        return segundos;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;

    }

    public double getDias() {
        return dias;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

}
