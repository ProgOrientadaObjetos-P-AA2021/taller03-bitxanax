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
public class Terreno {
  private double costo,
                 ancho,
                 largo,
                 area,
                 valorMetro ;

    public double getValorMetro() {
        return valorMetro;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }
    
    
    public double getCosto() {
        return costo;
    }

    public void calcularCosto() {
        costo = area * valorMetro;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        area = largo * ancho;
    }
    
}
