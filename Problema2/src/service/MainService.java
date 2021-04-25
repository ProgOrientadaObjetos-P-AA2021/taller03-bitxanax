/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.EquivalenciaHora;

/**
 *
 * @author bitxanax
 */
public class MainService {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            EquivalenciaHora equivalencia = CrearEquivalencia((double) i);
            imprimirEquivalencias((int) equivalencia.getHoras(), (int) equivalencia.getMinutos(), (int) equivalencia.getSegundos(), (int) equivalencia.getDias());
        }

    }

    public static EquivalenciaHora CrearEquivalencia(double hora) {
        EquivalenciaHora equivalencia = new EquivalenciaHora();
        equivalencia.setHoras(hora);
        equivalencia.calcularSegundos();
        equivalencia.calcularMinutos();
        equivalencia.calcularDias();
        return equivalencia;
    }

    public static void imprimirEquivalencias(int hora, int minutos, int segundos, int dias) {
        System.out.print("\n====================\n");         
        System.out.printf(" Horas: %s \n Dias: %s\n Minutos: %s\n Segundos: %s", hora, dias, minutos, segundos);
        System.out.print("\n====================\n");
    }

    
    
}
