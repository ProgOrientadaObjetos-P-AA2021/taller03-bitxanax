/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Terreno;

/**
 *
 * @author bitxanax
 */
public class MainService {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
             Terreno terreno = generarTerreno(265.6*i, 263*i, 120 + i);
             imprimirValoresTerreno(i, terreno.getArea(), terreno.getCosto());
        
        }
    }

    public static Terreno generarTerreno(double ancho, double largo, double valorMetro) {
        Terreno terreno = new Terreno();
        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setValorMetro(valorMetro);
        terreno.calcularArea();
        terreno.calcularCosto();

        return terreno;
    }

    public static void imprimirValoresTerreno(int id, double area, double costo) {
        System.out.print("\n====================\n");
        System.out.printf(" Terreno nº: %d\n Area: %.2f\n Costo: %.2f", id, area, costo);
        System.out.print("\n====================\n");
    }

}
